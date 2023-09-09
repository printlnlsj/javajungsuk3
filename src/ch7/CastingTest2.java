package ch7;

/**
 * 예제 7-16
 */
public class CastingTest2 {
    public static void main(String[] args) {
//        Car car = new Car(); // 에러가 발생한 이유는 참조변수 car가 참조하고 있는 인스턴스가 Car타입의 인스턴스여서 이다.
        Car car = new FireEngine(); // 이렇게 수정하면 에러는 없어진다.
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car; // 컴파일은 OK. 실행 시 에러가 발생
        fe.drive();
        car2  = fe;
        car2.drive();
    }
}
