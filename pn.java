
/**
 * 여기에 pn 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class pn
{
    public static void main (String[] args)
    {
        String phoneNum1 = "407-555-2207";
String phoneNum2 = "407-555-5000";
	
if(phoneNum1.compareTo(phoneNum2) == 0) { System.out.println("phoneNum1 precedes phoneNum2  1");}
	
if(phoneNum1.compareTo(phoneNum2) == -1) { System.out.println("phoneNum1 precedes phoneNum2  2"); }
	
if(phoneNum1.compareTo(phoneNum2) == 1) { System.out.println("phoneNum1 precedes phoneNum2  3"); }
	
if(phoneNum1.compareTo(phoneNum2) < 0) { System.out.println("phoneNum1 precedes phoneNum2  4"); }
	
if(phoneNum1.compareTo(phoneNum2) > 0) { System.out.println("phoneNum1 precedes phoneNum2  5"); }
    }
}
