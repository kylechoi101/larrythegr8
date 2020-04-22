import java.util.Random;
/**
 * 여기에 rfgh 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class rfgh
{
    public static void main(String[] args)
    {
       int a = 6;
int b = 0;
while (a < 20)
{
   b = 10;
   while (b > a)
   {
      b--;
    }
    a += b;
   }
System.out.println(a);
    }
}
