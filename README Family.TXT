------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Faamily test
PURPOSE OF PROJECT: find out the percentage of types of family with text reader
VERSION or DATE: V3
HOW TO START THIS PROJECT:bluej
AUTHORS: Kyle Choi
USER INSTRUCTIONS:

/**
 * 여기에 Family 클래스 설명을 작성하십시오.
 * 
 * @author Kyle Chiu
 * @version V3
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
      double Total = 0;
      String Token = "";
      File fileName = new File("maleFemaleInFamily.txt");
      Scanner inFile = new Scanner(fileName);
      int totalB = 0;
      int totalG = 0;
      int totalBoth = 0;
      
      while (inFile.hasNext())
      {
         Token = inFile.nextLine( );      
         if(Token.equals("BB"))  
         {totalB += 1;}
         else if(Token.equals("GG"))
         {totalG +=1;}
         else
         {totalBoth +=1;}
         Total += 1;
      }

      System.out.println("Composition statistics for families with two children.\n ");
      System.out.println("Total number of families: " + (int)Total);
      System.out.println("");
      System.out.println("\t  2 boys: " + totalB + " represents " + (totalB / Total * 100) +"%");
      System.out.println("\t  2 girs: " + totalG + " represents " + (totalG / Total * 100) +"%");
      System.out.println("1 boy and a girl: " + totalBoth + " represents " + (totalBoth / Total * 100) +"%");
      
      inFile.close();                 
    }
}