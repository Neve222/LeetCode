package demo;

/**
 * @author mmn
 * @date 2020/12/15
 */
public class VolatileExamples {

}

class VolatileFeaturesExample {
    volatile  long v1 = 0L;

    //s使用volatile声明64位的long型变量
    public void set(long l) {
        v1 = l;
        //单个volatile变量的写
    }

    public void getAndIncrement() {
        v1++;
        //复合(多个)volatile变量的读/写
    }

    public long get() {
        return v1;
        //单个volatile变量的读
    }

}

class VolatileFeaturesExampleDemo {
    long v1 = 0L;
    //64位的long型普通变量
    public synchronized void set(long l) {
        v1 = l;
    }

    public void getAndIncrement() {
        //普通方法调用
        long temp = get();
        temp += 1L;

        //普通写操作
        set(temp);
        //调用已同步的写方法
    }

    public synchronized long get() {
        //对单个的普通变量的读用同一个锁同步
        return v1;
    }

}


/**
 * 根据happens-before规则，这个过程建立的happens-before关系可以分3类：
 * 1、
 */
class VolatileExample {
    int a = 0;

    volatile boolean flag = false;

    public void writer() {
        a = 1;          //1
        flag = true;    //2
    }

    public void reader() {
        if (flag) {     //3
            int i = a;  //4
        }
    }
}
