import java.lang.Math;
class Triangle {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculateArea() {
        double s = (a + b + c) / 2;
        Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}
class Trianglecal {
    public static void main(String[] args) {
        Triangle abc = new Triangle(12, 8, 4.5);
        System.out.println("Area of Triangle:" + abc.calculateArea());
        System.out.println("Perimeter of Triangle:" + abc.calculatePerimeter());
    }
}
