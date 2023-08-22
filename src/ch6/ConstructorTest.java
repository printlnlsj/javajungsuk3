package ch6;

/**
 * 예제 6-23
 */
class Data3 {
    int value;
}

class Data4 {
    int value;

    Data4(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}


public class ConstructorTest {
    public static void main(String[] args) {
        Data3 d3 = new Data3();
//        Data4 d4 = new Data4(); // compile error 발생
        Data4 d4 = new Data4(10); // OK
        System.out.println("d4 = " + d4.value);
    }
}
