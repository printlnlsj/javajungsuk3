package ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 예제 7-37
 */
public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEnvent occurred");
    }
}
