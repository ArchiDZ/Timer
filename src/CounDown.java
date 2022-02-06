import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class CounDown {
    public static void tictac() {
        JFrame jframe = new JFrame();
        JLabel msec = new JLabel();
        JLabel sec = new JLabel();
        JLabel min = new JLabel();
       // JButton start = new JButton(ActionListener)

        jframe.setLayout(new FlowLayout());
        jframe.setBounds(500, 300, 400, 100);
        jframe.add(min);
        jframe.add(msec);
        jframe.add(sec);
        jframe.setVisible(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate (new TimerTask() {
            int i,s,m = 0;

            public void run (){


                msec.setText(" "+i);
                sec.setText(" "+s);
                min.setText(" "+m);
                i++;
                if (i==10){
                    i=0;
                    s++;
                    if(s==60){
                        s=0;
                        m++;}
//                    timer.cancel();
//                    jlabel.setText("Timer Over");
                }

            }
        },0,100);
    }
}
