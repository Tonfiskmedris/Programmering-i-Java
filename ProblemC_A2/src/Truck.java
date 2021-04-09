public class Truck {

    //metod för att räkna ut volym på varje sedelbunt och totala volymen. Retunerar sedan totala volymen.

    public static double calculation(int numberOfStacks, double length, double width, double height){
        double volumeOfCashBundle = length * width * height;
        double totalVolume = numberOfStacks * volumeOfCashBundle;
        System.out.printf("%d stacks of cash with following dimensions %.0fx%.0fx%.0f will have a total volume of: ", numberOfStacks,length,width,height);
        return totalVolume;
    }
}
