package ch7;

/**
 * 예제 7-29
 */
public class InterfaceTest3 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.methodA();
    }
}

class A2 {
    void methodA() {
        I1 i = InstanceManager.getInstance(); // 제 3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
        i.methodB();
        System.out.println(i.toString()); // i로 Object클래스의 메서드 호출가능
    }
}

interface I1 {
    public abstract void methodB();
}

class B2 implements I1 {
    public void methodB() {
        System.out.println("methodB in B2 class");
    }

    public String toString() { return "class B2"; }
}

class InstanceManager {
    public static I1 getInstance() {
        return new B2();
    }
}