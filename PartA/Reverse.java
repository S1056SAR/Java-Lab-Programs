import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Reverse extends JFrame implements KeyListener{
JLabel l,l1;
JTextField tf1;
Reverse(){
setLayout(new FlowLayout());
l=new JLabel("Number:");
tf1=new JTextField(10);
tf1.addKeyListener(this);
l1=new JLabel();
add(l);
add(tf1);
add(l1);
setVisible(true);
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
int reverse(int n){
int rev=0,digit=0;
while(n!=0){
digit=n%10;
rev=rev*10+digit;
n/=10;
}
return rev;
}
public void keyPressed(KeyEvent e){
    int number;
    if(e.getKeyChar()=='j'|| e.getKeyChar()=='J'){
            number = Integer.parseInt(tf1.getText());
            int reversedNumber = reverse(number);
            l1.setText("Reversed number: " + reversedNumber);
        } 
    }
public void keyReleased(KeyEvent e){};
public void keyTyped(KeyEvent e){};

public static void main(String[] args){
new Reverse();
}
}