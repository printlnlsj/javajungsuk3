package ch7;

/**
 * 예제 7-30
 */
public class DefaultMethodTest {
    public static void main(String[] args) {
        Child5 c = new Child5();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child5 extends Parent5 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child"); // 오버라이딩
    }
}

class Parent5 {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

interface MyInterface {
    default void method1() { // 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩
        System.out.println("method1() in MyInterface");
    }

    default void method2() { // Parent5의 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}