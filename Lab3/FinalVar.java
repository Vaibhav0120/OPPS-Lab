import java.util.Scanner;

public class FinalVar {
    private static final double PI = 3.14;
    private final double radius;

    FinalVar(double r) {
        radius = r;
    }

    double area() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();

        FinalVar circle = new FinalVar(r);
        System.out.println("Area of the circle: " + circle.area());
        scanner.close();
    }
}
