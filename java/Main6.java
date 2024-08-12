import java.util.*;
public class Main6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<=a;i++)
if(a%i==1){
System.out.print(i+""+"is a prime");
}
else{
System.out.print("not a prime");
}
}
}