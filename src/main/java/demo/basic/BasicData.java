package demo.basic;

/**
 * @author mmn
 * @date 2020/12/17
 */
public class BasicData {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y); // false

        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k); // true

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);

        Integer c = 129;
        Integer d = 129;
        System.out.println(c == d);
    }
}
