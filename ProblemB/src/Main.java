import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner keyBoardInput = new Scanner(System.in);

        String answerOne, answerTwo, answerFour;
        int answerThree;

        while (true) {

            System.out.println("Is the person a\na)male b)female");
            answerOne = keyBoardInput.nextLine();
            System.out.println("Are you already a customer:\na)yes b)no");
            answerTwo = keyBoardInput.nextLine();
            System.out.println("How old are you?\n1)0-10 2)11-20 3)20+");
            answerThree = Integer.parseInt(keyBoardInput.nextLine());
            System.out.println("Have you answered everything correctly?\ny/n");
            answerFour = keyBoardInput.nextLine();

            if (answerFour.equals("y"))
                break;
        }
        System.out.printf("First answer: %s%nSecond Answer: %s%nThird Answer: %s%nForth Answer: %s%n", answerOne, answerTwo, answerThree, answerFour);
    }
}
