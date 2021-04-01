import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int columns;

        System.out.println("Specify number of rows: ");
        row = input.nextInt();
        System.out.println("Specify number of columns: ");
        columns = input.nextInt();

        for (int i=1;i<=row;i++){
            for (int j = 1; j<=columns;j++){
                System.out.print("X");
            }
            System.out.println();

        }



    }
}
