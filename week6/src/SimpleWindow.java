import javax.swing.*;

public class SimpleWindow extends JFrame {
    //I am not going to have a main method in this file
    //Constructor - special method that display our attributes
    public SimpleWindow(){
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Second Simple Window");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Don't forget to display it!!!
        setVisible(true);
    }
}
