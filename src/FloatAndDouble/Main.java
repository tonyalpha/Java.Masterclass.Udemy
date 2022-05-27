package FloatAndDouble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMinFloatValue);
        System.out.println("Float maximum value = "+myMaxFloatValue+"\n");

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "+myMinDoubleValue);
        System.out.println("Double maximum value = "+myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5F/3F;
        double myDoubleValue = 5.00/3.00;

        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("MyFloatValue = "+myFloatValue);
        System.out.println("MyDoubleValue = "+myDoubleValue);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many pounds would you like to convert to kilograms?");
        double pound = keyboard.nextDouble();
        double kilograms = pound * 0.45359237D;
        System.out.println("Converted "+pound+" pounds to "+kilograms+" kilograms.");

        double pi = 3.1415927D;
        double anotherNumber = 3_000_000.4_4567_890D;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
