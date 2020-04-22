
/**
 * This program demonstrates how to assign values to individual
 * positions of a String array with user input.
 *Orlando, FL   60.9    62.6    67.4    71.5    77.1    81.2    82.4    82.5    81.1    75.3    68.8    63.0
 * Orlando, FL  2.4 2.4 3.5 2.4 3.7 7.4 7.2 6.3 5.8 2.7 2.3 2.3
 * @author David J. Farber
 * @version 06/06/17
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void main(String [] args)
    {
        String [] months = new String[12];
        double [] temperature ={60.9,    62.6 ,   67.4   , 71.5   , 77.1 ,   81.2   , 82.4,    82.5  ,  81.1   , 75.3 ,   68.8    ,63.0};     //initialize with Fahrenheit values
        double [] precipitation ={2.4 ,2.4 ,3.5 ,2.4, 3.7 ,7.4, 7.2, 6.3 ,5.8, 2.7 ,2.3 ,2.3};      //initialize with inch values
    
        months[0] = "Jan.";
        months[1] = "Feb.";
        months[2] = "Mar.";
        months[3] = "Apr.";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "Aug.";
        months[8] = "Sep.";
        months[9] = "Oct.";
        months[10] = "Nov.";
        months[11] = "Dec.";
        System.out.println("\t\tWeather Data");
        System.out.println("\tLocation: Orlando, Florida");
        System.out.println("Month\tTemperature(F)\tPrecipitation(in.)");
        for(int n = 0; n < 40; n++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        // Input: assign user input to each index within the array
        for(int n = 0; n < 12; n++)
            {
                System.out.println(months[n] + "\t\t" + temperature[n] + "\t\t" + precipitation[n]);
                
            }
        double total = 0.0;
        double annual = 0.0;
        // Output: traverse the array to display contents of array
        
        for(int n = 0; n < 12; n++)
        {
            total +=  temperature[n] ;
            annual += precipitation[n];
        }
        for(int n = 0; n < 40; n++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        System.out.println("\tAverage: "+ total / 12 + "\tAnnual" + annual);
    }
}