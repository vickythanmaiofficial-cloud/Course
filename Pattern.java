import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
       for(int i=1;i<=2*n;i+=2)
        {
            for(int j=0;j<((2*n)-1-i)/2;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
         }
        
    }
}