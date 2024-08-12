import java.util.*;
public class Main7{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m = sc.nextInt();
Main7 p=new Main7();
if(m>1 && p.isPrime(m))
System.out.print("prime");
else
System.out.print("not Prime");
}
boolean isPrime(int m){
for(int i=2;i<=m/2;i++){
if(m%i==0){
return false;
}
}
return true;
}
}