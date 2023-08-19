package ch6;

/**
 * 예제 6-15
 * flash영상 RecursiveCall.exe 참조
 */
public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n) {
        int result = 0;
        if(n <= 0 || n > 12) { // 매개변수 유효성 검사를 추가
            return -1;
        }

        if(n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1); // 다시 메서드 자신을 호출한다.
        }
        return result;
    }
}
