import java.util.*;

public class Rectangle {
   
 private int width;
 private int height;

    
Rectangle(int width, int height) {
this.width = width;
this.height = height;
System.out.println("Area: " + (width * height));
System.out.println("Perimeter: " + (2 * (width + height)));
}
 public static void main(String[] args) {
 Rectangle obj = new Rectangle(10, 20);
    }
}
