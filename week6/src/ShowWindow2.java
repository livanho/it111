import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {
    public static void main(String[] args) {
        JFrame window= new JFrame("A Simple Window");
        JTextField myTextField1,myTextField2;
        JLabel myLabel1,myLabel2;

        myLabel1=new JLabel("My First Big Label!!!");
        myLabel1.setBounds(50,50, 200,30);
        myLabel1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        myTextField1=new JTextField();
        myTextField1.setBounds(50,80, 200,30);

        myLabel2=new JLabel("My Second Big Label!");
        myLabel2.setBounds(50,120, 200,30);
        myLabel2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        myTextField2=new JTextField();
        myTextField2.setBounds(50,150, 200,30);

        window.add(myLabel1);window.add(myLabel2);
        window.add(myTextField1); window.add(myTextField2);
        window.setSize(400,400);
        window.getContentPane().setBackground(Color.RED);
        window.setLayout(null);
        window.setLocation(500,200);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
