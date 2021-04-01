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

        //Här har vi en for-loop i en for-loop = Nästlad loop.
        //först sätter vi i=rader vilket får utgöra den yttre loopen
        //vi ger variabeln startvärde 1, sen ska loopen forsätta tills värdet är lika med insatta värdet för raderna.
        // Sist så säger vi att loopen ökar värdet från startvärdet med 1 tills vi når värdet för raderna.
        for (int i = 1; i <= row; i++) {
            //sedan sätter vi j=kolumner vilket får utgöra den inre loopen. Samma sak gäller här som för raderna gällande
            // variabeln och hur for-loopen skall bete sig.
            for (int j = 1; j <= columns; j++) {

                //vi väljer att använda print för att vi vill printa kolumnerna horisontellt. Println hade resulterat i att vi
                // printade allt vertikalt.
                System.out.print("X");
            }
            //för att få rader vertikalt och kolumner horisonellt måste vi använda
            // oss av println för att splitta på raderna och kolumnerna.
            System.out.println();

        }


    }
}
