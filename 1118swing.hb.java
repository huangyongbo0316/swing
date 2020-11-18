package demo;

import javax.swing.*;

public class App {
    private JPanel myPanel;

    void go(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,300,600,600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new  App().go();
    }
}
