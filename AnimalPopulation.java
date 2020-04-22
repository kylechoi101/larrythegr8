
/**
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 *
 * @author Kyle Choi
 * @version 10
 */
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
class AnimalPopulation
{
   public static void main (String [ ] args) throws IOException
   {
      double average = 0.0;
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to the Fox Squirrel Simulator \n");
      System.out.println("How many trials should be simulated?");
      System.out.print("Enter a value greater than 1000: ");
      int number = in.nextInt();
      System.out.println(number + "\n");
      while(number < 1000)
       {
           System.out.println(" Please try again. Enter a number greater than 1000.\n");
           System.out.print("Enter a value greater than 1000: ");
           number = in.nextInt();
           System.out.println(number + "\n");
        }
      System.out.println("simulating trials now... one moment please... \n");
      for (int loop = 0; loop < number; loop++)
       {
           write(loop);
           average += read(loop);
       }
       
       System.out.println("The results!");
       System.out.println("The average number of suquirrels observed until");
       System.out.print("spotting a Fox Squirrel at the city park is: ");
       System.out.println(average / number);
       
   }
   public static void write(int loop) throws IOException
   {
       int num = 0;
      Random randNumList = new Random();
    PrintWriter outFile = new PrintWriter(new File(loop + "animal.txt"));
    while(num != 10)
           {
               num = randNumList.nextInt(10) +1;
               outFile.println(num);
           }
             
    outFile.close ( ); 
    
   }
   public static int read(int loop) throws IOException
    {
      String token = "";
      int intToken = 0;
      File fileName = new File(loop + "animal.txt");
      Scanner inFile = new Scanner(fileName);
      
      int length = 0;
      
      while (inFile.hasNext())
      {
         intToken = inFile.nextInt( );  
         length += 1;
      }
      
      inFile.close();  
      return  length; 
    }
}
