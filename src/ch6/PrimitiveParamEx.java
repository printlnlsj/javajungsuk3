package ch6;

/**
 * 예제 6-9
 * flash영상 PrimitiveParam.exe 참조
 */

class Data { int x; }

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
