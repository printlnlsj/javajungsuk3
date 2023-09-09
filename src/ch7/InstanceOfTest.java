package ch7;

/**
 * 예제 7-17
 */
public class InstanceOfTest {
    public static void main(String[] args) {
        FireEngine1 fe = new FireEngine1();

        if (fe instanceof FireEngine1) {
            System.out.println("This is a FireEngine instance");
        }
        if (fe instanceof Car1) {
            System.out.println("This is a Car instance");
        }
        if (fe instanceof Object) {
            System.out.println("This is an Object instance");
        }

        System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
    }
} // class

class Car1 {}
class FireEngine1 extends Car1 {}