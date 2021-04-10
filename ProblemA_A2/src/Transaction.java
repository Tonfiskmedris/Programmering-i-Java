public class Transaction {
    private double balance;
    private double deposit;
    private double withdraw;

    //Setter metod för att kunna sätta ett värde på vår insättning samt att den adderar värdet på vårt saldo
    public void setDeposit(double deposit) {
        this.deposit = deposit;
        if (deposit != 0) {
            balance = balance + getDeposit();
        }

    }

    //getter metod för att kunna läsa vårat setter värde på setDeposit
    public double getDeposit() {
        return deposit;
    }

    //setter metod för att kunna sätta ett värde på vårt uttag samt att den subtraherar värdet på vårt saldo
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
        if (withdraw != 0) {
            balance = balance - getWithdraw();
        }

    }

    //getter metod för att kunna läsa vårat setter värde på setWithdraw
    public double getWithdraw() {
        return withdraw;
    }

    //getter metod för att kunna läsa vårat saldo (ingen setter till balance då det enda sättet att få ett saldo != 0 är genom att det sker en transaktion i form av deposit eller withdraw
    public double getBalance() {
        return balance;
    }
}
