public class CheckingClass_7_1 {
    double balance;
    String name;

    public void withdraw(double x) {
        if (x < 1) {
            System.out.println("Invalid number inputted.");
        } else if (x > balance) {
            System.out.println("Withdrawal amount more than balance amount.");
        } else {
            balance = balance - x;
            System.out.println("Your new balance is: " + balance);
        }

    }
}
