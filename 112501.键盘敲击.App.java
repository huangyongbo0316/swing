import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea1=new JTextArea();
    JTextArea textArea2=new JTextArea();
    //构造方法
    public App() {
        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    textArea2.append("点击上键\n");
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    textArea2.setText("");
                }

            }
        });
    }
    //显示窗体方法
    void go(){
        textArea1.setBounds(100,100,100,100);
        textArea2.setBounds(100,300,100,100);
        textArea1.setBackground(Color.yellow);
        textArea2.setBackground(Color.red);
        myPanel.add(textArea1);
        myPanel.add(textArea2);
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
