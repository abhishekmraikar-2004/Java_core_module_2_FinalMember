package module2;

/*
 * Final Members in Java:
 * final keyword is used to restrict modification.
 * It can be applied to:
 * 1. Variable
 * 2. Method
 * 3. Class
 */

// Final class: cannot be extended
final class FinalDemo {

    // Final variable: value cannot be changed
    final int MAX_SPEED = 100;

    // Normal variable
    String vehicleName = "Car";

    // Final method: cannot be overridden
    final void displayDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Maximum Speed: " + MAX_SPEED);
    }
}

public class FinalMembers {

    public static void main(String[] args) {

        FinalDemo obj = new FinalDemo();

        obj.displayDetails();

        // Final variable cannot be reassigned
        // obj.MAX_SPEED = 120;   // not allowed
    }
}