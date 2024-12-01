import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Calendar date = Calendar.getInstance();//function to get the instance for the current date


        DepositTransaction deposit = new DepositTransaction(800, date, "TXN1001");
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(500, date, "TXN1002");

        deposit.apply(account);
        deposit.printTransactionDetails();

        withdrawal.apply(account);
        withdrawal.printTransactionDetails();


        // Testing reverse functionality and partial withdrawal
        WithdrawalTransaction smallWithdrawal = new WithdrawalTransaction(2000, date, "TXN1003");
        smallWithdrawal.apply(account, true);

        //display final print
        System.out.println("Final Balance: " + account.getBalance());
    }
}
