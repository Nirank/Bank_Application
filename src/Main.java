import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  name , password and balance to create Account ");
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name ,password , balance);

        //add money
        String message = user.addMoney(10000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter a money you want to Withdraw ");
        int money = sc.nextInt();

        System.out.println("Enter a password ");
        String pass = sc.next();

        System.out.println(user.WithdrawMoney(money, pass));

        // rate of interest
        System.out.println(user.calculateInterest(10));
    }
}