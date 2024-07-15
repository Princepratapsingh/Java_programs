import java.util.Scanner;

public class Triangleareacalculate {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        double area = Triangle1.calculateArea(base, height);

        System.out.println("The area of the triangle is: " + area);

        
        sc.close();
       }
}
     class Triangle1 {
        
         public static double calculateArea(double base, double height) {
            return (base * height) / 2;
        }
    }
    

