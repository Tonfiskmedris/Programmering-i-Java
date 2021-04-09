import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String address;
        int phone;
        int accountNumber;
        Transaction myTransactions = new Transaction();
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Bank of Java. Please fill in the form: ");
        System.out.println("Name: ");
        name = input.nextLine();
        System.out.println("Address: ");
        address = input.nextLine();
        System.out.println("Phone: ");
        phone = input.nextInt();
        System.out.println("Account number: ");
        accountNumber = input.nextInt();
        input.nextLine();


        while (true) {
            System.out.println("--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(input.nextLine());


            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    double deposit = Double.parseDouble(input.nextLine());
                    myTransactions.setDeposit(deposit);
                }
                case 2 -> {
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = Double.parseDouble(input.nextLine());
                    myTransactions.setWithdraw(withdraw);
                }
                case 3 -> {
                    System.out.printf("Name            :%s%n", name);
                    System.out.printf("Address         :%s%n", address);
                    System.out.printf("Phone           :%d%n", phone);
                    System.out.printf("Account number  :%d%n", accountNumber);
                    System.out.printf("Current Balance :%.1f%n", myTransactions.getBalance());
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Do you wanna quit (y/n):");
                    String secondChoice = input.nextLine();
                    if (secondChoice.equals("y")) {
                        System.exit(0);
                    }
                }
            }
        }
    }
} 
