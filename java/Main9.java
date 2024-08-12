import java.util.*;
public class Main9{   
 public static void main(String args[]){ 
 Scanner sc=new Scanner (System.in);
 int a=sc.nextInt(); 
 int n,factorial=1;
   for(n=1;n<=a;n++){    
      factorial=factorial*n;    
  }    
  System.out.println(factorial);    
 } 
}