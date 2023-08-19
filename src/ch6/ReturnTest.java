package ch6;

/**
 * 예제 6-13
 */
public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = {0}; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
        r.add(3, 5, result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b; // 매개변수로 넘겨받은 배열에 연산결과를 저장
    } // 참조형 매개변수를 활용하면 반환값이 없어도 메서드의 실행결과를 얻어 올 수 있다/
}
