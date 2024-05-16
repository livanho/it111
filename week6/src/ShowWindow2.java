import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {
    public static void main(String[] args) {
        //declare our variable
        JLabel myLabel = new JLabel("My First Big Label!!!");
        JLabel myLabel2 = new JLabel("My Second Big Label!");
        JTextField myTextField = new JTextField();
        JTextField myTextField2 = new JTextField();

        //we are going to make two constants

        final int WINDOW_WIDTH = 300;
        final int WINDOW_HEIGHT = 450;

        //Create a window

        JFrame window = new JFrame();
        window.setTitle("A Simple Window");

        //Setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //window.getContentPane().setBackground(Color.red);
        window.setLocation(500,150);

        //adding background
        window.getContentPane().setBackground(Color.red);

        //adding components
        window.add(myLabel);
        myLabel.setBounds(20,20,20,20);
//
//        window.add(myTextField);
//        myTextField.setBounds(10,50,200,20);


        //close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //display the window - if we do not display the window, it will not display
        //displaying the window is a boolean
        window.setVisible(true);
    }
}
