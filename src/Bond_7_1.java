public class Bond_7_1 {
    String name;
    double balance, interest;
    int term, monthsLeft;

    public void termInterest(int t) {
        if(t >= 0 && t <= 11) {
            interest = 0.005;
        } else if(t >= 12 && t <= 23) {
            interest = 0.010;
        } else if(t >= 24 && t <= 35) {
            interest = 0.015;
        } else if(t >= 36 && t <= 47) {
            interest = 0.020;
        } else if(t >= 48 && t <=60) {
            interest = 0.025;
        } else {
            System.out.println("Invalid term length");
            t = 0;
        }
        term = t;
        monthsLeft = t;
    }
    public void earnInterest(){
        if(monthsLeft > 0) {
            balance += balance * interest / 12;
            monthsLeft--;
            System.out.println("Balance: $" + balance);
            System.out.println("Interest rate: " + interest);
            System.out.println("Months remaining: " + monthsLeft);
        } else {
            System.out.println("Your bond has matured.");
        }
    }
}
