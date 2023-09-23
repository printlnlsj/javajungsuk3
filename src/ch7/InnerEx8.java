package ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 예제 7-38
 */
public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }); // 익명 클래스의 끝
    } // main의 끝
} // InnerEx8의 끝
