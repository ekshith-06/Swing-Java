import java.io.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame extends JFrame implements TreeSelectionListener{
    JTree tree;
    JLabel l;
    MyFrame(){
        super("JTreeDemo");
        File f=new File("C:\\AWT");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\AWT");
        for(File x:f.listFiles())root.add(new DefaultMutableTreeNode(x.getName()));
        tree=new JTree(root);
        tree.addTreeSelectionListener(this);
        JScrollPane sp=new JScrollPane(tree);
        l=new JLabel("No File Selected");
        add(sp,BorderLayout.CENTER);
        add(l,BorderLayout.SOUTH);
    }
    public void valueChanged(TreeSelectionEvent e){
        l.setText(e.getPath().toString());
    }

}

public class JTreeDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
