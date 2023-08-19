package ch6;

/**
 * 에제 6-14
 */
class Data2 { int x; }

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 d2 = new Data2();
        d2.x = 10;

        Data2 dd2 = copy(d2); // static Data2 copy(Data2 d2)
        System.out.println("d2.x = " + d2.x);
        System.out.println("dd2.x = " + dd2.x);
    }

    static Data2 copy(Data2 d2) {
        Data2 tmp = new Data2(); // 새로운 객체 tmp를 생성한다.
        tmp.x = d2.x; // d.x의 값을 tmp.x에 복사한다.
        return tmp; // 복사한 객체의 주소를 반환한다.
    }
}
