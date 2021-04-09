public class Transaction {
    private double balance;
    private double deposit;
    private double withdraw;


    public void setDeposit(double deposit) {
        this.deposit = deposit;
        if (deposit != 0) {
            balance = balance + getDeposit();
        }

    }

    public double getDeposit() {
        return deposit;
    }


    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
        if (withdraw != 0) {
            balance = balance - getWithdraw();
        }

    }

    public double getWithdraw() {
        return withdraw;
    }


    public double getBalance() {
        return balance;
    }

}


