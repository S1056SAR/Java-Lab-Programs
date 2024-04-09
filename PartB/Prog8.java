import java.util.*;
public class Prog8{
public static void main(String[] args){
String s1,s2;
Scanner sc=new Scanner(System.in);
s1=sc.nextLine();
s2=s1.toUpperCase();
System.out.println(s2);
int count=0;
for(int i=0;i<s2.length()-1;i++){
if(s2.charAt(i)==s2.charAt(i+1)){
count++;
}
}
System.out.println(count);
}
}