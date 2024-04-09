class Bank{
    float getBankInterest(){
        return 0;
    }
}
class AXIS extends Bank{
    float getBankInterest(){
        return 9;
    }
}
class SBI extends Bank{
    float getBankInterest(){
        return 8;
    }
}
class ICIC extends Bank{
    float getBankInterest(){
        return 7;
    }
}
public class prog1{
    public static void main(String[] args) {
        SBI s=new SBI();
        AXIS a=new AXIS();
        ICIC i=new ICIC();
        System.out.println("interest rate of SBI : "+s.getBankInterest()+"\ninterest rate of ICIC : "+i.getBankInterest()+"\ninterest rate of AXIS : "+a.getBankInterest());
    }
}