package HelloWorld;

public class Hello {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;


        System.out.println("Hello, Tony!");
        System.out.println("This is my first number: " + myFirstNumber);
        System.out.println("This is my total: " + myTotal);
        System.out.println("This is my last one: " + myLastOne);

    }
}