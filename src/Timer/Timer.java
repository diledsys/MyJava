package Timer;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Timer {
    static int i=0;

    public Timer(int i, AbstractAction abstractAction) {
    }

    public static void main(String[] args) {

        Timer t = new Timer(1000/60,new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(i++);
            }
        });
    }
}
