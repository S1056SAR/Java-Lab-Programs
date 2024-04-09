class BankDetails{
    static int annualinterestrate;
    private double SavingsBalance;
    BankDetails(int s){
        this.SavingsBalance=s;
    }
    static void modifyinterestrate(int x){
        annualinterestrate=x;
    }
    void monthlyinteresrate(){
        SavingsBalance+=(SavingsBalance*annualinterestrate)/12;
    }
    void display(){
        System.out.println("\n The savings balance is : "+SavingsBalance);
    }
}
public class prog6 {
    public static void main(String[] args) {
        BankDetails s1=new BankDetails(2000);
        BankDetails s2=new BankDetails(3000);
        BankDetails.modifyinterestrate(4);
        s1.monthlyinteresrate();
        s2.monthlyinteresrate();
        s1.display();
        s2.display();
        BankDetails.modifyinterestrate(5);
        s1.monthlyinteresrate();
        s2.monthlyinteresrate();
        s1.display();
        s2.display();
    }
    
}
