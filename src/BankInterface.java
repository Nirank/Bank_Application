public interface BankInterface {
    double checkBalance();
    String addMoney(int amt);
    String WithdrawMoney(int amt , String pass);
    double calculateInterest(int yrs);
}
