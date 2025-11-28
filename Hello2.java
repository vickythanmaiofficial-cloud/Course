import java.util.*;
class Hello2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int e : arr)
        {
            if(e>first_max)
            {
                second_max=first_max;
                first_max=e;
        }
            else if(e>second_max && e!=first_max)
                second_max=e;
        }
        
        System.out.println("second max element in array is "+second_max);

    }
}