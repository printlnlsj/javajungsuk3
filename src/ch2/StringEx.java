package ch2;

// 예제 2-3
public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name); // Java
        System.out.println(str); // Java8.0
        System.out.println(7 + " "); // 7_  여기서 _는 빈 공간을 의미.
        System.out.println(" " + 7); // _7
        System.out.println(7 + ""); // 7(문자)
        System.out.println("" + 7); // 7(문자)
        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // 14(문자)
        System.out.println("" + 7 + 7); // 77(문자)
    }
}
