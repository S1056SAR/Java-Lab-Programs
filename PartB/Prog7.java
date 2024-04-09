interface Calc{
public int res(int x,int y);
}
class Prog7{
public static void main(String[] args){
Calc sum=(int x,int y)->{
return x+y;
};
System.out.println(sum.res(10,5));
Calc multi=(x,y)->{
return x*y;
};
System.out.println(multi.res(10,15));
}
}