public class PositiveOrNegative
{  
      public static void main(String[] args)   
      {  
          int n = 38;
          check(n);
          n = -45;
          check(n); 
       }
       public static void check(int n)
       {  
              if(n > 0)  
              {  
                 System.out.println("The Number is positive:" +n);  
              }  
              else   
              {  
                 System.out.println("The Number is negative:" +n);  
              }  
        }    
}