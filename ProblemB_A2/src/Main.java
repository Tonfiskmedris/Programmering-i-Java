public class Main {

    public static void main(String[] args) {
        //Anropar på metoden 8ggr
        interestRate(100,2);
        interestRate(100,3);
        interestRate(100,4);
        interestRate(100,5);
        interestRate(100,6);
        interestRate(100,7);
        interestRate(100,8);
        interestRate(100,9);

    }
    //metod som beräknar slutsaldo givet givna parametrar. Printar sedan ut parametrerna och slutsaldo
     public static void interestRate(double initialAmount, double rate){
        double interest = rate/100;
        double finalBalance = initialAmount*(1+interest);

         System.out.println("-------------------------------------------");
         System.out.printf("Initial amount         : %.2f%n", initialAmount);
         System.out.printf("Interest rate          : %.2f%%%n", rate);
         System.out.printf("Balance after one year : %.2f%n", finalBalance);

    }
}
