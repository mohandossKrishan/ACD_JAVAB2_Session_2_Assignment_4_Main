import java.util.Scanner;
public class HighestOfThreeNumbers
{
   public static void main(String args[])
   {
      int a, b, c;
      Scanner in = new Scanner(System.in);
     System.out.print(  "Enter the first number  :");
     a = in.nextInt();
     System.out.println("");			
     System.out.print(  "Enter the first number  :");
     b = in.nextInt();
     System.out.println("");			
     System.out.print("Enter the third  number :");
     c = in.nextInt();
     System.out.println("");			
 
     if ( a > b && a > c )
         System.out.println( a + " ie. First Number is highest.");
      else if ( b > a && b > c )
         System.out.println( b + " ie. Second Number is highest." );
      else if ( c > a && c > b )
         System.out.println( c + " ie. Third Number is highest.");
       }
}