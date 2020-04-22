


/**
 * 여기에 BuyClothes 클래스 설명을 작성하십시오.
 * 
 * @author Kyle Choi
 * @version 2019-11-23
 * 
 */
import java.util.Scanner;
public class BuyClothes
{
    public static void main(String []args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? (First): ");
        String name = keyboard.nextLine();
        String Fname = name.substring(0,1);
        System.out.println("What is your name? (Last): ");
        String Lname = keyboard.nextLine();
        System.out.println("What is your debit card number? (*****-***-****): ");
        String Debit = keyboard.nextLine();
        Debit = Debit.substring(10);
        int DNumber;
        DNumber = Integer.parseInt(Debit);
        System.out.println("What is your PIN number? (4 digits): ");
        String PIN = keyboard.nextLine();
        int PNumber;
        PNumber = Integer.parseInt(PIN);
        System.out.println("What is today's date?(mm/dd/yyyy) : ");
        String Date = keyboard.nextLine();
        int month = Integer.parseInt(Date.substring(0,2));
        int day = Integer.parseInt(Date.substring(3,5));
        int year = Integer.parseInt(Date.substring(6));
        System.out.println("Item list");
        System.out.println("A - Dark Denim. L $40");
        System.out.println("B - Dark Denim. M $40");
        System.out.println("C - Dark Denim. S $40");
        System.out.println("D - Camp Collar Shirts. L $35");
        System.out.println("E - Camp Collar Shirts. M $35");
        System.out.println("F - Camp Collar Shirts. S $35");
        System.out.println("G - Faux Fur. L $60");
        System.out.println("H - Faux Fur. M $60");
        System.out.println("I - Faux Fur. S $60");
        System.out.println("J - Tweed. L $55");
        System.out.println("K - Tweed. M $55");
        System.out.println("L - Tweed. S $55");
        System.out.println("M Leopard Print. L $15");
        System.out.println("N Leopard Print. M $15");
        System.out.println("O Leopard Print. S $15");
        System.out.println("P - Modern Workwear. L $170");
        System.out.println("Q - Modern Workwear. M $170");
        System.out.println("R - Modern Workwear. S $170");
        System.out.println("S - Suit L $399");
        System.out.println("T - Suit M $399");
        System.out.println("U - Suit S $399");
        
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";
        String H = "H";
        String I = "I";
        String J = "J";
        String K = "K";
        String L = "L";
        String M = "M";
        String N = "N";
        String O = "O";
        String P = "P";
        String Q = "Q";
        String R = "R";
        String S = "S";
        String T = "T";
        String U = "U";
        
        String Item = " ";
        String bought = "";
        System.out.println("What did you buy? (item letter(A-U)): ");
        Item = keyboard.nextLine();
        bought += Item;
        while(!Item.equals("0"))
        {
            
            bought += Item;
            System.out.println("What else did you buy? (item letter(A-U)): ");
            System.out.println("(To stop, enter 0)");
            Item = keyboard.nextLine();
        }
        int start = 0;
        int start2 = 1;
        int sum = 0 ;
        
        while(start < bought.length() )
        {
        if (bought.substring(start,start2).equalsIgnoreCase(A) ||bought.substring(start,start2).equalsIgnoreCase(B) ||bought.substring(start,start2).equalsIgnoreCase(C))
        {
            sum += 40;//40 35 60 55 15 170 399
            start++;
            start2++; 
        }
        else if (bought.substring(start,start2).equalsIgnoreCase(D) ||bought.substring(start,start2).equalsIgnoreCase(E) ||bought.substring(start,start2).equalsIgnoreCase(F))
        {
            sum += 35;//40 35 60 55 15 170 399
            start++;
            start2++; 
        }
        else if (bought.substring(start,start2).equalsIgnoreCase(G) ||bought.substring(start,start2).equalsIgnoreCase(H) ||bought.substring(start,start2).equalsIgnoreCase(I))
        {
            sum += 60;//40 35 60 55 15 170 399
            start++;
            start2++; 
        }
        else if (bought.substring(start,start2).equalsIgnoreCase(J) ||bought.substring(start,start2).equalsIgnoreCase(K) ||bought.substring(start,start2).equalsIgnoreCase(L))
        {
            sum += 55;//40 35 60 55 15 170 399
            start++;
            start2++; 
        }
        else if (bought.substring(start,start2).equalsIgnoreCase(M) ||bought.substring(start,start2).equalsIgnoreCase(N) ||bought.substring(start,start2).equalsIgnoreCase(O))
        {
            sum += 15;//40 35 60 55 15 170 399
            start++;
            start2++; 
        }
        else if (bought.substring(start,start2).equalsIgnoreCase(P) ||bought.substring(start,start2).equalsIgnoreCase(Q) ||bought.substring(start,start2).equalsIgnoreCase(R))
        {
            sum += 170;//40 35 60 55 15 170 399
            start++;
            start2++; 
        }
        else if (bought.substring(start,start2).equalsIgnoreCase(S) ||bought.substring(start,start2).equalsIgnoreCase(T) ||bought.substring(start,start2).equalsIgnoreCase(U))
        {
            sum += 170;//40 35 60 55 15 170 399
            start++;
            start2++; 
        }
        else
        { 
            start++;
            start2++; 
        }
        }
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("Your e-Receipt");
        System.out.println("");
        System.out.println(month + "-" + day + "-" + year);
        System.out.println("Order number:" + Fname + DNumber);
        System.out.println("");
        
        System.out.println("    " + Fname + ".   " + Lname);
        System.out.println("    Account: *****-***-" + DNumber);
        System.out.println("    Number of Items: " + (bought.length() - 1));
        System.out.println("    Total Amount: $ " + sum);
        System.out.println("    ");
        System.out.println("    $ " + sum + " will be charged" );
        System.out.println("    Thank you.");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    }
}
