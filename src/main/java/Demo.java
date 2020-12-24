
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    public static void main(String[] args) {
        int aHundredMillion = 10000000;

        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map.put(i, i);
        }
        long s2 = System.currentTimeMillis();
        System.out.println("未初始化容量，耗时 ： " + (s2 - s1));

        Map<Integer, Integer> map1 = new ConcurrentHashMap<>(aHundredMillion / 2);
        long s5 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map1.put(i, i);
        }
        long s6 = System.currentTimeMillis();
        System.out.println("初始化容量"+aHundredMillion / 2+"，耗时 ： " + (s6 - s5));

        Map<Integer, Integer> map2 = new ConcurrentHashMap<>(aHundredMillion);
        long s3 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map2.put(i, i);
        }
        long s4 = System.currentTimeMillis();
        System.out.println("初始化容量为"+aHundredMillion+"，耗时 ： " + (s4 - s3));

        Map<Integer, Integer> map3 = new ConcurrentHashMap<>(16);
        long s7 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map3.put(i, i);
        }
        long s8 = System.currentTimeMillis();
        System.out.println("初始化容量为16，耗时 ： " + (s8 - s7));

        Map<Integer, Integer> map4 = new ConcurrentHashMap<>(15);
        long s9 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map4.put(i, i);
        }
        long s10 = System.currentTimeMillis();
        System.out.println("初始化容量为15，耗时 ： " + (s10 - s9));
    }
}
