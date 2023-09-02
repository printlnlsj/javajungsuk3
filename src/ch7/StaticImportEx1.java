package ch7;

import static java.lang.Math.*;
import static java.lang.System.out;

/**
 * 예제 7-11
 */
public class StaticImportEx1 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println("Math.PI : " + Math.PI);
        out.println("Math.PI : " + PI);
    }
}
