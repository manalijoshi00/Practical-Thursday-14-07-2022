import java.util.Scanner;
class SumofDigits
{
    public static void main(String[] args)
    {
        int j, n, num,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            j = num % 10;
            sum = sum + j;
            num = num / 10;
        }
        System.out.println("Sum of digit=" + sum);
    }
}
