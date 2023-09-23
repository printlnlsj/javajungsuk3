package ch7;

/**
 * 예제 7-35
 */
class Outer1 {
    int value = 10; // Outer.this.value

    class Inner1 {
        int value = 20; // this.value

        void method() {
            int value = 30;
            System.out.println("            value : " + value);
            System.out.println("       this.value : " + this.value);
            System.out.println("Outer1.this.value : " + Outer1.this.value);
        }
    } // Inner클래스 끝
} // Outer클래스 끝

public class InnerEx5 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner = outer1.new Inner1();
        inner.method();
    }
} // InnerEx5 끝
