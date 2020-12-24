package demo;

import java.util.ArrayList;

/**
 * 测试oom
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author mmn
 * @date 2020/12/23
 */
public class HeapOOMDemo {
    static class OOMObject {

    }
    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
