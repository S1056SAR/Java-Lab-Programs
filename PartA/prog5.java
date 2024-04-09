class Car{
    int speed;
    double regularprice;
    String color;
    Car(int s,double rp,String c){
        this.speed=s;
        this.color=c;
        this.regularprice=rp;
    }
    double getSalePrice(){
        return regularprice;
    }
}
class Truck extends Car{
    int weight;
    Truck(int s,double rp,String c,int w){
        super(s,rp,c);
        this.weight=w;
    }
    double getSalePrice(){
        if(weight>2000)
        return regularprice*0.9;
        else
        return regularprice*0.8;
    }
}
class Ford extends Car{
    int year,manufacturdiscount;
    Ford(int s,double rp,String c,int m){
        super(s,rp,c);
        this.manufacturdiscount=m;
    }
    double getSalePrice(){
        regularprice-=manufacturdiscount;
        return regularprice;
    }
    
}
class Sedan extends Car{
    int length;
    Sedan(int s,double rp,String c,int l){
        super(s, rp, c);
        this.length=l;
    }
    double getSalePrice(){
        if(length>20)
        return regularprice*0.95;
        else
        return regularprice*0.9;
    }
}
public class prog5 {
    public static void main(String[] args) {
        Truck t=new Truck(200,10000000,"Red",5000);
        System.out.println("Sale price of truck : "+t.getSalePrice());
        Sedan s=new Sedan(150,3000000,"Blue",27);
        System.out.println("Sale price of Sedan : "+s.getSalePrice());
        
    }
    
}
