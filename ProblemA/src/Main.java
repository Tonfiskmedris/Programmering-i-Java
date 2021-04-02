import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Satta integraler för programmet
        int balance = 0, transaction, deposit = 0, withdraw = 0;

        System.out.println("Current balance: " + balance);
        System.out.println("Enter a deposit or withdraw (>0 = deposit, <0 = withdraw: ");

        //sätter gränser för hur programmet skall köras + lägger till en Scanner för att kunna läsa av användarinput
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            transaction = input.nextInt();

            //summerar nya saldot efter varje transakion
            balance += transaction;

            System.out.println("Current balance :" + balance);
            System.out.println("Enter a deposit or withdraw (>0 = deposit, <0 = withdraw: ");

            //if statement används för att kategorisera vad ska lagras som deposit/withdraw
            if (transaction >= 0) {
                deposit += 1;
            } else {
                withdraw += 1;
            }
        }
        System.out.println("# of deposits : " + deposit);
        System.out.println("# of withdraws: " + withdraw);
        System.out.println("Final balance: " + balance);
    }
}
