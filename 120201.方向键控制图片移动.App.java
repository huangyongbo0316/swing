import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel labelPlane=new JLabel();
    int num=64;
    int x,y;
    //构造方法
    public App() {
            myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(labelPlane.getX()+","+labelPlane.getY());
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    labelPlane.setBounds(labelPlane.getX(),labelPlane.getY()-num,num,num);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    labelPlane.setBounds(labelPlane.getX(),labelPlane.getY()+num,num,num);
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    labelPlane.setBounds(labelPlane.getX()-num,labelPlane.getY(),num,num);
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    labelPlane.setBounds(labelPlane.getX()+num,labelPlane.getY(),num,num);
                }

            }
        });
    }
    //显示窗体方法
    void go(){


        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        labelPlane.setIcon(new ImageIcon(imgURL));
        labelPlane.setBounds(228,612,num,num);
        myPanel.add(labelPlane);

        java.net.URL imgURL1 = App.class.getResource("img/background.png");
        label_txt.setIcon(new ImageIcon(imgURL1));
        label_txt.setBounds(0,0,512,720);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("雷霆战机");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
