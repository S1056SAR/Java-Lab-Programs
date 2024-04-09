import java.awt.*;
import javax.swing.*;
import java.awt.events.*;
class Reverse extends JFrame implements KeyListener{
JLabel l,l1;
JTextField tf1;
Reverse(){
setLayout(new FlowLayout());
l=new JLabel("Number:");
tf1=new JTextField(10);
l1=new JLabel();
add(l);
add(tf1);
add(l1);
setVisible(true);
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
int reverse(int n){
int rev=0,digit;
while(n!=0){
digit=n%10;
rev+=digit*10;
n/=10;
}
return rev;
}
public void keyPressed(KeyEvent e){
if(e.getKeyChar()=="J" || e.getKeyChar()=="j"){
int number=Integer.ParseInt(tf1.getText());
int reversenumber=reverse(number);
l1.setText("Reversed number "+reversenumber);

}

}

public static void main(String[] args){
new Reverse();
}
}