import java.util.*;
abstract class Student{
    private String name;
    double grade;
    int ID,age;
    abstract boolean isPassed(double grade);
    final void setter(String n){
        name=n;
    }
    String getter(){
        return name;
    }
}
class Undergrad extends Student{
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Name,ID,age");
        String n=sc.next();
        setter(n);
        ID=sc.nextInt();
    }
    boolean isPassed(double grade){
        if(grade>70.0)
        return true;
        else
        return false;
    }
    void display(){
        System.out.println("Name:"+getter()+"\nAge:"+age+"\nID"+ID);
    }
}
class Grad extends Student{
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID,Age,Name,Grade");
        ID=sc.nextInt();
        age=sc.nextInt();
        setter(sc.next());
        this.grade=sc.nextDouble();

    }
    boolean isPassed(double grade){
        if(this.grade>80.0){
            return true;
        }
        return false;
    }
    void display(){
        System.out.println("THe details of the student:");
        System.out.println("ID:"+ID+"\nName:"+getter()+"\nAge : "+age+"Has passed : "+isPassed(grade));
    }
}
public class prog4 {
    public static void main(String[] args) {
        Undergrad ug=new Undergrad();
        ug.getData();
        ug.display();
        if(ug.isPassed(65.0)){
            System.out.println("Student has passed");
        }
        else{
            System.out.println("Student failed");
        }
        Grad g=new Grad();
        g.getData();
        g.display();
    }
}
