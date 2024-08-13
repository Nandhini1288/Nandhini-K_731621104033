import java.util.Scanner;
public class Person{
int Age;
String Name;
Person(int Age,String Name){
    this(21);
    this.Age=Age;
    this.Name=Name;
    this.hello();
}
Person(int Age){
  System.out.println("Age:"+""+Age);

}
void hello(){
   System.out.print("Name:"+""+Name);

}

  public static void main(String args[]){
    Person person=new Person(21,"Nandini");
   
    }
}
     