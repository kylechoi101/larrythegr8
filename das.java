import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
class MysteryPrintWriter
{
public static void main (String[]args) throws IOException
    {
      String token = "";
      
      File fileName = new File( "HU.txt");
      Scanner inFile = new Scanner(fileName);
      
      int length = 0;
      
      while (inFile.hasNext())
      {
         token = inFile.next( );  
         System.out.println(token.substring(1,5));
      }
      
      inFile.close();  
       
    }
}