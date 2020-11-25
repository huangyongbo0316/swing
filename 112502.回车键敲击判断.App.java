import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea1=new JTextArea();
    JTextArea textArea2=new JTextArea();
    JLabel jLabel=new JLabel();
    //构造方法
    public App() {
        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(textArea1.getText().equals("王大锤")){
                        textArea2.append("Good！！\n");
                    } else {
                        textArea2.append("丑拒！\n");
                    }

                   /* if(textArea1.getText().equals("")){

                    }*/

                }


                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    textArea1.setText("");
                    textArea2.setText("");
                }

            }
        });
    }
    //显示窗体方法
    void go(){
        jLabel.setText("友情提示:点击键盘Down清空");
        textArea1.setText("最帅的男人，是谁？");
        textArea1.setBounds(100,100,200,100);
        textArea2.setBounds(100,300,200,100);
        textArea1.setBackground(Color.yellow);
        textArea2.setBackground(Color.orange);
        jLabel.setBounds(50,50,200,50);

        myPanel.add(textArea1);
        myPanel.add(textArea2);
        myPanel.add(jLabel);
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
