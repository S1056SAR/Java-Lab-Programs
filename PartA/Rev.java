import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class Rev extends JFrame implements KeyListener{
    JLabel l1,l2;
    JTextField tf1;
    Rev(){
        setLayout(new FlowLayout());
        l1=new JLabel("Enter the number to be reversed");
        l2=new JLabel();
        tf1=new JTextField(10);
        tf1.addKeyListener(this);
        add(l1);
        add(tf1);
        add(l2);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    int reverse(int n){
        int num=n;
        int digit=0,rev=0;
        while(num!=0){
            digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return rev;
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyChar()=='j'||e.getKeyChar()=='J'){
            int num=Integer.parseInt(tf1.getText());
            int rev=reverse(num);
            l2.setText("Reversed : "+rev);
        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public static void main(String[] args) {
        new Rev();
    }
}
