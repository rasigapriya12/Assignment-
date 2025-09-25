import java.util.Scanner;

class Calc {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

public class Overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();
        System.out.print("Enter two integers: ");
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println("Sum: " + c.add(x, y));

        System.out.print("Enter two doubles: ");
        double d1 = sc.nextDouble(), d2 = sc.nextDouble();
        System.out.println("Sum: " + c.add(d1, d2));

        System.out.print("Enter three integers: ");
        int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
        System.out.println("Sum: " + c.add(p, q, r));
    }
}
