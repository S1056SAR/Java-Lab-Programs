import java.util.*;;
abstract class Vehicle{
    boolean hashelmet;
    int yom;
    abstract void getData();
    abstract void putData();
    Vehicle(boolean hashelmet,int yom){
        this.hashelmet=hashelmet;
        this.yom=yom;
    }
}
class TwoWheeler extends Vehicle{
    private String Brand;
    protected int cost;
    String Enginetype;
    public String color;
    TwoWheeler(int n){
        super(true,n);
    }
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the following details :\nBrand,cost,Engine type and color");
        Brand=sc.next();
        cost=sc.nextInt();
        Enginetype=sc.next();
        color=sc.next();
    }
    void putData(){
        System.out.println("details\n");
        System.out.println("Brand :"+Brand+"\nCost:"+cost+"\nEnginetype"+Enginetype+"\nColor:"+color+"\nhelmet:"+hashelmet+"\nYear of manufacture:"+yom);
    }
}
final class FourWheeler extends Vehicle{
    FourWheeler(int n){
        super(false,n);
    }
    void getData(){}
    void putData(){
        System.out.println("\nFour Wheeler details :\n");
        System.out.println("helmet : "+hashelmet+"yom:"+yom);
    }
}

public class prog2 {
    public static void main(String[] args) {
        FourWheeler f=new FourWheeler(2005);
        TwoWheeler t=new TwoWheeler(2009);
        t.getData();
        t.putData();
        f.putData();
        
    }
}
