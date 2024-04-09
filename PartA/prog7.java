class Customer{
    private int ID;
    private String name;
    private int discount;
    Customer(int id,String n,int dis){
        this.ID=id;
        this.name=n;
        this.discount=dis;
    }
    int getID(){
        return ID;
    }
    int getDiscount() {
        return discount;
    }
    String getName(){
        return name;
    }
    void setDiscount(int discount){
        this.discount=discount;
    }
    public String toString(){
        return name+"("+ID+")";
    }
}
class Invoice{
    private int ID;
    private Customer c;
    private double amount;
    Invoice(int ID,Customer c,double amount){
        this.ID=ID;
        this.c=c;
        this.amount=amount;
    }
    int getID(){
        return ID;
    }
    Customer getCustomer(){
        return c;
    }
    void setCustomer(Customer c){
        this.c=c;
    }
    String getAmount(){
        return Double.toString(amount);
    }
    void setAmount(double amount){
        this.amount=amount;
    }
    String getustomerName(){
        return c.getName();
    }
    double getAmountafterdiscount(){
        return ((this.amount*c.getDiscount())/100);
    }
}

public class prog7 {
    public static void main(String[] args) {
        Customer c1=new Customer(25, "Raju", 7);
        System.out.println("Details of the customer: ");
        System.out.println(c1.getID());
        System.out.println(c1.getName());
        System.out.println(c1.getDiscount());
        c1.setDiscount(8);
        System.out.println("After discount:");
        System.out.println(c1.getDiscount());
        System.out.println(c1);
        Customer c2=new Customer(28, "Rajeev", 8);
        Invoice i=new Invoice(21, c2, 450.0);
        System.out.println("Invoice Details:");
        System.out.println(i.getID());
        System.out.println(i.getCustomer());
        System.out.println(i.getAmount());
        i.setAmount(25000);
        System.out.println(i.getAmount());
        System.out.println(i.getustomerName());
        System.out.println(i.getAmountafterdiscount());
    }
}
