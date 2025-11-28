import java.util.*;
class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n+3;i++)
        {
            for(int j=1;j<=n+3;j++)
            {
                if(i==1 || i==n+3 || j==1 || j==n+3)
                {
                    System.out.print(n);
                }
                else if(i==2 || i==n+2 || j==2 || j==n+2 )
                    System.out.print(n-1);
                else if((i==3 || i==n+1) || j==3 || j==n+1)
                    System.out.print(n-2);
                else if(i==n || j==n)
                    System.out.print(n-3);
                
            }
           System.out.println();
        
           
        }
    }
}
