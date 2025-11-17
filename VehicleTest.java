import java.util.Scanner;

class Vehicle {
    void display() { System.out.println("This is a vehicle"); }
}
class Car extends Vehicle {
    void display() { System.out.println("This is a car"); }
}
class Bike extends Vehicle {
    void display() { System.out.println("This is a bike"); }
}

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Vehicle\n2. Car\n3. Bike");
        int choice = sc.nextInt();
        Vehicle v;
        if (choice == 1) v = new Vehicle();
        else if (choice == 2) v = new Car();
        else v = new Bike();
        v.display();
    }
}
