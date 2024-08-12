import java.util.*;
public class Main11  
{  
public static void main( String args[] )   
{  
Scanner sc=new Scanner(System.in);
int min = sc.nextInt();//200  
int max = sc.nextInt();//400  
System.out.println("Random value of type double between "+min+" to "+max+ ":");  
double a = Math.random()*(max-min+1)+min;   
System.out.println(a);  
System.out.println("Random value of type int between "+min+" to "+max+ ":");  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);  
}  
}  