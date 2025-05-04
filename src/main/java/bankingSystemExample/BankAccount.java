package bankingSystemExample;

public class BankAccount {

    private System accountNumber;

    private double balance;

    private CurrencyType currencyType;

    public BankAccount(System accountNumber, double balance, CurrencyType currencyType) {
        if (balance<0){
            System.out.println("Eksik bakiye ile hesap oluşturulamaz!!");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public void deposit(double amount) {
        if (amount < 0) {

            balance += amount;
            System.out.println(amount+ " "+ currencyType + " yatırıldı.Yeni bakiyeniz=" + balance + currencyType.getSymbol());
        } else {
            System.out.println("Geçersiz tutar!!");
        }
    }



}
