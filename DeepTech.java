class DeepTech
{
     public static void main(String[] args)
     {
         System.out.println("Enter the number from 1 to 100 is:");
         for(int i=1;i<100;i++)
         {
              if(i%3==0 && i%5==0)
              {
                   System.out.println("DeepTech");
              }
              else if(i%3==0)
              {
                   System.out.println("Deep");
              }
              else if(i%5==0)
              {
                   System.out.println("Tech");
              }
              else
              {
                 System.out.println(+i);
              }
         }
     }
}