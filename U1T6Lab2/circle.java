package U1T6Lab2;
public class circle {
    
    private double radius;
        
    public circle(double rad) {
            radius = rad;
     }
    public void PrintArea() {
            double area = radius * radius * Math.PI;
            System.out.println("My area is " + area);
        }
   }

