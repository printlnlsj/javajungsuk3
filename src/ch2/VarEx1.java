package ch2;

// 예제 2-1
public class VarEx1{
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year); // 0
        System.out.println(age); // 14

        year = age + 2000; // 변수 age의 값에 2000을 더해서 변수 year에 저장
        age = age + 1; // 변수 age에 저장된 값을 1증가시킨다.

        System.out.println(year); // 2014
        System.out.println(age); // 15
    }
}
