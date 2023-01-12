import java.util.Objects;
import java.util.UUID;

public class SBIUser implements  BankInterface{
    private String accNumber;
    private String name;
    private String password;
    private double balance;
    private static double RateOfInterest;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.RateOfInterest = 6.5;
        this.accNumber = String.valueOf(UUID.randomUUID());
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRateOfInterest() {
        return RateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        RateOfInterest = rateOfInterest;
    }

    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amt) {
        balance += amt;
        return "Updated Balance  "+balance;
    }

    @Override
    public String WithdrawMoney(int amt , String pass) {
        if(Objects.equals(pass, password)){
            if(amt > balance)
                return "Insufficient Balance";
            else{
                    balance=balance-amt;
                    return " Remaining Balance";
            }
        }
        return "Incorrect Password";
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*RateOfInterest)/100;
    }
}
