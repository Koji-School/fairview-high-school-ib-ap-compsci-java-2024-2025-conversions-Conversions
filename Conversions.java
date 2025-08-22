import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Koji Dennis
 * @version 8/290/2025
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Feet to Miles");
        System.out.println("8. Miles to Feet");
        System.out.println("9. Gallons to Liters");
        System.out.println("10.  Liters to Gallons");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = fahrenheit * (5.0 / 9.0) - 32;
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meter = feet * 0.3048;
            System.out.println(feet + " feet is " + meter + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter meter: ");
            double meter = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meter * 3.28084;
            System.out.println(meter + " meter is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.5735;
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters * 0.033814;
            System.out.println(milliliters + " milliliters is " + ounces + " degrees ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = feet * 0.000189394;
            System.out.println(feet + " feet is " + miles + " miles");
        }
        if (selection == 8)
        {
            System.out.println("Enter miles: ");
            double miles = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = miles * 5280.0016896;
            System.out.println(miles + " miles is " + feet + " feet");
        }
        if (selection == 9)
        {
            System.out.println("Enter Gallons: ");
            double Gallons = keyboard.nextDouble();
            keyboard.nextLine();
            double liter = Gallons * 3.78541;
            System.out.println(Gallons + "  Gallons is " + liter + " liter");
        }
        if (selection == 10)
        {
            System.out.println("Enter liter: ");
            double liter = keyboard.nextDouble();
            keyboard.nextLine();
            double Gallons = liter * 0.264172;
            System.out.println(liter + " liter is " + Gallons + "  Gallons");
        }
    }
}