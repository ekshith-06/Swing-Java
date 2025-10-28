import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame{
    JLabel l;
    JButton b;
    int ct=0;
    MyFrame(){
        super("Swing Demo");
        l=new JLabel("Clicked "+ct+" Times");
        b=new JButton("Click");
        setLayout(new FlowLayout());
        add(l);
        add(b);
        add(new JButton("Cancle"));
        b.addActionListener((ActionEvent e)->{
            ct++;
            l.setText("Clicked "+ct+"Times");
        });
        getRootPane().setDefaultButton(b);
        l.setToolTipText("Counting");
    }
}
public class Swing1{
    public static void main(String []ar){
        MyFrame f=new MyFrame();
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}