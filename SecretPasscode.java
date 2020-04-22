
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
class SecretPasscode
{
   public static void main (String [ ] args) throws IOException
   {
      double average = 0.0;
      int number = 1;
      int loop = 0;
      int count = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("\t\t\tPassword Generator Menu");
       for (int i = 0; i < 56; i++)
            {
                System.out.print("*");
            }
        System.out.println("*");
        System.out.print("*\t\t[1]\t Lowercase Letters \t\t*\n");
        System.out.print("*\t\t[2]\t Uppercase Letters \t\t*\n");
        System.out.print("*\t\t[3]\t Special Letters \t\t*\n");
        System.out.print("*\t\t[4]\t emoji \t\t\t\t*\n");
        System.out.print("*\t\t[5]\t Quit \t\t\t\t*\n");
        for (int i = 0; i < 56; i++)
            {
                System.out.print("*");
            }
        System.out.println("*");
        System.out.println("Enter Selection (1-5): ");
      int Selectnumber = in.nextInt();
      if(Selectnumber == 5)
            {
               System.out.println("");
            System.out.println("Thank you for using the Pass Code Generator. \n");
            System.out.println("here are your randomly generated codes");
            }
      while(Selectnumber < 1 || Selectnumber > 5)
        {
           System.out.println("\tInvalid option. Please try again.\n");
           System.out.println("Enter Selection (1-5): ");
           Selectnumber = in.nextInt();
        }
        
      System.out.println("Password Length (6 or more): ");
      int Lengthnumber = in.nextInt();
      while(Lengthnumber < 5)
        {
           System.out.println("\tPassword length too short. Please try again.");
           System.out.println("Password Length (6 or more): ");
           Lengthnumber = in.nextInt();
        }
      while(Selectnumber != 5)
        {
            if(Selectnumber == 1)
            {
            write1(loop,Lengthnumber);
            }
            else if(Selectnumber == 2)
            {
            write2(loop,Lengthnumber);
            }
            else if(Selectnumber == 3)
            {
            write3(loop,Lengthnumber);
            }
            else if(Selectnumber == 4)
            {
            write4(loop,Lengthnumber);
            }
            loop ++;
            System.out.println("Enter Selection (1-5): ");
            
            
            Selectnumber = in.nextInt();
            if(Selectnumber == 5)
            {
                last(loop);
            }
            else
            {
                while(Selectnumber < 1 || Selectnumber > 5)
                {
                System.out.println("\tInvalid option. Please try again.\n");
                System.out.println("Enter Selection (1-5): ");
                Selectnumber = in.nextInt();
                }
                System.out.println("Password Length (6 or more): ");
                Lengthnumber = in.nextInt();
                while(Lengthnumber < 5)
                {
                System.out.println("\tPassword length too short. Please try again.");
                System.out.println("Password Length (6 or more): ");
                Lengthnumber = in.nextInt();
                }
            }
        }
        
        
      
       
   }
   public static void write1(int loop, int length) throws IOException
   {
       String Passcode = "";
      Random randNumList = new Random();
      int num = 0;
      int coin = 0;
      PrintWriter outFile = new PrintWriter(new File(loop + "passcode.txt"));
      for(int i = 0; i < length; i++)
        {
            coin = randNumList.nextInt(2);
            if(coin == 1)
            {
                num = randNumList.nextInt(26) + 97;
                Passcode += (char)num;
            }
            else
            {
                num = randNumList.nextInt(10);
                Passcode += num;
            }
        }
      outFile.println(1+ loop + "\t" + Passcode);
          
      outFile.close ( ); 
    
   }
   public static void write2(int loop, int length) throws IOException
   {
       
        String Passcode = "";
      Random randNumList = new Random();
      int num = 0;
      int coin = 0;
      PrintWriter outFile = new PrintWriter(new File(loop + "passcode.txt"));
      for(int i = 0; i < length; i++)
        {
            coin = randNumList.nextInt(3);
            if(coin == 1)
            {
                num = randNumList.nextInt(26) + 97;
                Passcode += (char)num;
            }
            else if(coin == 2)
            {
                num = randNumList.nextInt(10);
                Passcode += num;
            }
            else
            {
                num = randNumList.nextInt(26) + 65;
                Passcode += (char)num;
            }
        }
      outFile.println(1+ loop + "\t" + Passcode);
          
      outFile.close ( ); 
    
   }
   public static void write3(int loop, int length) throws IOException
   {
         String Passcode = "";
      Random randNumList = new Random();
      int num = 0;
      int coin = 0;
      PrintWriter outFile = new PrintWriter(new File(loop + "passcode.txt"));
      for(int i = 0; i < length; i++)
        {
            coin = randNumList.nextInt(3);
            if(coin == 1)
            {
                num = randNumList.nextInt(26) + 97;
                Passcode += (char)num;
            }
            else if(coin == 2)
            {
                num = randNumList.nextInt(10);
                Passcode += num;
            }
            else
            {
                num = randNumList.nextInt(127) + 128;
                Passcode += (char)num;
            }
        }
      outFile.println(1+ loop + "\t" + Passcode);
      
          
      outFile.close ( ); 
    
   }
   public static void write4(int loop, int length) throws IOException
   {
         String Passcode = "";
      Random randNumList = new Random();
      int num = 0;
      int coin = 0;
      PrintWriter outFile = new PrintWriter(new File(loop + "passcode.txt"));
      for(int i = 0; i < length; i++)
        {
            coin = randNumList.nextInt(6);
            if(coin == 1)
            {
                
                Passcode += ":)";
            }
            else if(coin == 2)
            {
                
                Passcode += ":D";
            }
            else if(coin == 3)
            {
                
                Passcode += ":(";
            }
            else if(coin == 4)
            {
                num = randNumList.nextInt(26) + 97;
                Passcode += (char)num;
            }
            else if(coin == 5)
            {
                num = randNumList.nextInt(10);
                Passcode += num;
            }
        }
      outFile.println(1+ loop + "\t" + Passcode);
          
      outFile.close ( ); 
    
      }
   
   public static void read(int i) throws IOException
    {
      String token = "";
      
      File fileName = new File(i + "passcode.txt");
      Scanner inFile = new Scanner(fileName);

      
      token =  inFile.nextLine( );
      System.out.println(token);
      inFile.close();  
      
    }
    public static void last(int loop) throws IOException
    {
        System.out.println("");
            System.out.println("Thank you for using the Pass Code Generator. \n");
            System.out.println("here are your randomly generated codes");
            for(int k = 0; k < loop; k++)
            {
                
                read(k);
            }
    }
}
