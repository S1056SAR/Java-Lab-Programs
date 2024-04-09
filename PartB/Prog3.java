class Sin extends Thread{
double result,deg;
public Sin(double deg){
this.deg=deg;
}
public void run(){
result=Math.sin(deg);
}
}
class Cos extends Thread{
double result,deg;
public Cos(double deg){
this.deg=deg;
}
public void run(){
result=Math.cos(deg);
}
}
class Tan extends Thread{
double result,deg;
public Tan(double deg){
this.deg=deg;
}
public void run(){
result=Math.tan(deg);
}
}
public class Prog3{
public static void main(String[] args){
double sum;
Sin x=new Sin(45.0);
Cos y=new Cos(45.0);
Tan z=new Tan(45.0);
x.start();
y.start();
z.start();
try{
x.join();
y.join();
z.join();
sum=x.result+y.result+z.result;
System.out.println("the result is: "+sum);
}
catch(Exception e){}
}
}



