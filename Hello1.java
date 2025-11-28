import java.util.*;
class Hello1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=0;
        while(n1>0 && n2>0)
        {
            if(n1>n2)
                n1=n1%n2;
            else 
                n2=n2%n1;
        }
        if(n1==0)
            gcd=n2;
        else 
            gcd=n1;
        System.out.println("gcd is "+gcd);
    
        
    }

}