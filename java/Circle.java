public class Circle {
   private double radius;
   public Circle(double radius) {
   this.radius = radius;
    }
public double getRadius() {
        return radius;
    }
public void setRadius(double radius) {
       if (radius > 0) { 
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    public double getArea() {
        return 
3.14* radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }

    
    public static void main(String[] args) {
      
        Circle circle = new Circle(5.0);

    
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

     
        circle.setRadius(10.0);

        System.out.println("\nAfter updating radius to 10.0:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
