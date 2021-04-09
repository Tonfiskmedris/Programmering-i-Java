import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main myApp = new Main();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an initial amount: ");
        double balance = Double.parseDouble(input.nextLine());

    //skapar en for-loop för att sätta så att programmet endast körs 10 ggr
    //printar nya saldot och anropar då vår bonus metod som i sin tur anropat på deposit metoden.
        for (int i = 0; i < 10; i++) {
            System.out.printf("New balance: %.2f%n",balance += myApp.bonus(myApp.deposit()));
            System.out.println("-----------------------------------");
        }

        System.out.printf("The final balance is $%.2f ", balance);
    }

    //metod utan parameter som retunerar ett värde, i detta fall vår deposit utan bonus.
    public double deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an amount of money to deposit: ");
        return Double.parseDouble(input.nextLine());
    }

    //metod med parameter som retunerar ett värde, i detta fall är det vår nya värde efter bonus.
    public double bonus(double deposit) {
        return deposit * 1.1;
    }
}