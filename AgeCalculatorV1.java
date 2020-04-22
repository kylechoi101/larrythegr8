/**
 * The purpose of this program is to calculate your age in minutes
 *
 * @author Kyle Choi
 * @version 11/23/2019
 */
import java.util.Scanner;
public class AgeCalculatorV1
{
    public static void main(String[] args)
    {
        //construct a Scanner object called in
        Scanner in = new Scanner(System.in);

        //ask user for input
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.next();
        System.out.print("\n");

        System.out.print("Please your age in years: ");
        String userAge = in.next();
        int ageInYears = Integer.parseInt(userAge);

        //calculate age in minutes
        double approxAgeInDays = ageInYears * 365.25;
        int ageInHours = (int)approxAgeInDays * 24;
        int ageInMinutes = ageInHours * 60;
         System.out.print("/tab Age in Minutes: " + ageInMinutes + "/n");
         System.out.print("/t Age in Minutes: " + ageInMinutes + "/n");
         System.out.print("/t Age in Minutes: " + ageInMinutes + "/n");
        String firstInitial = firstName.substring(0,1);
        String name = firstInitial  + ". " + lastName;

        // display name and minutes to screen
        System.out.print("Name: " + name);
        System.out.print("\t\t Age in Minutes: " + ageInMinutes + "\n");
    }
}