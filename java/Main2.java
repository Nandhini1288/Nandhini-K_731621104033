import java.util.*;
public class Main2{
  public static void main(String args[]){
    int employeeId;
    String employeeName;
    float employeeSalary;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter employee id");
employeeId=sc.nextInt();
System.out.println("Enter employee name");
employeeName=sc.next();
System.out.println("Enter employee Salary");
employeeSalary=sc.nextFloat();
System.out.println("employee id:"+employeeId);
System.out.println("employee name:"+employeeName);
System.out.print(" employee name:"+employeeSalary);
}
}