import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " using Credit Card"); }
}
class PayPal implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " using PayPal"); }
}
class Cash implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " using Cash"); }
}

public class PaymentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        System.out.println("1. Credit Card\n2. PayPal\n3. Cash");
        int ch = sc.nextInt();
        if (ch == 1) p = new CreditCard();
        else if (ch == 2) p = new PayPal();
        else p = new Cash();
        p.pay(amt);
    }
}
