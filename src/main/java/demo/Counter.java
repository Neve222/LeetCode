package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author mmn
 * @date 2020/12/11
 */
public class Counter {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;

    public static void main(String[] args) {
        final Counter cas = new Counter();
        List<Thread> ts = new ArrayList<Thread>(600);

        long start = System.currentTimeMillis();
        for (int j = 0; j < 100 ; j++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        cas.count();
                        cas.safeCount();
                    }
                }
            });

            ts.add(t);
        }

        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cas.i);
        System.out.println(cas.atomicInteger.get());
        System.out.println(System.currentTimeMillis() - start);
    }


    /**
     * 使用CAS实现线程安全计数器
     */
    private void safeCount() {
        for (; ;) {
            int i = atomicInteger.get();
            boolean suc = atomicInteger.compareAndSet(i, ++i);

            if (suc) {
                break;
            }
        }
    }

    /**
     * 非线程安全计数器
     */
    private void count() {
        i++;
    }

}
