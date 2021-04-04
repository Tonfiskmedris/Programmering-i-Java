import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeU = 0, grade3 = 0, grade4 = 0, grade5 = 0;
        System.out.println("Enter number of students: ");
        int numberStudents = input.nextInt();

        //Loopar programmet lika många gånger som användaren väljer att sätta in antal studenter
        for (int i = 1; i <= numberStudents; i++) {
            System.out.println("Enter grade " + "[" + i + "]" + ":");
            int score = input.nextInt();

            //Här får vi programmet att lagra och katogorisera betyg samt addera antal studenter på varje betyg
            if (score >= 0 && score <= 19) {
                gradeU += 1;
            } else if (score >= 20 && score <= 29) {
                grade3 += 1;
            } else if (score >= 30 && score <= 35) {
                grade4 += 1;
            } else if (score >= 36 && score < 40) {
                grade5 += 1;
            } else {
                System.out.println("Error! Not valid number");
            }
        }

        //Använder ett if statements för att programmet skall printa antal stundenter per betyg + andel av totala resultat
        //samt att om ingen har betyget säger programmet det
        if (gradeU > 0) {
            System.out.println("# of U: " + gradeU + " (" + (float) gradeU / numberStudents * 100 + "%" + ")");
        } else {
            System.out.println("# of U: No one has this grade");
        }
        if (grade3 > 0) {
            System.out.println("# of 3: " + grade3 + " (" + (float) grade3 / numberStudents * 100 + "%" + ")");
        } else {
            System.out.println("# of 3: No one has this grade");
        }
        if (grade4 > 0) {
            System.out.println("# of 4: " + grade4 + " (" + (float) grade4 / numberStudents * 100 + "%" + ")");
        } else {
            System.out.println("# of 4: No one has this grade");
        }
        if (grade5 > 0) {
            System.out.println("# of 5: " + grade5 + " (" + (float) grade5 / numberStudents * 100 + "%" + ")");
        } else {
            System.out.println("# of 5: No one has this grade");
        }
    }
}

