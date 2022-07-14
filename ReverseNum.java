import java.util.Scanner;
class ReverseNum
{
   public static void main(String args[])
   {
      int num=0;
      int reverse =0;
      int rem;
      System.out.println("Enter the number: ");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      while( num != 0 )
      {
          rem = num % 10;
          reverse = reverse * 10;
          reverse = reverse + rem;
          num = num/10;
      }

      System.out.println("The Reverse number is: "+reverse);
   }
}