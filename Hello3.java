import java.util.*;
class Hello3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements in array");
        

        int n=sc.nextInt();
        int arr[]=new int[n];
        int count[]=new int[1000];
       
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int j=0;j<n;j++)
        {
            count[arr[j]-1]++;
        }
        for(int k=0;k<n;k++)
        {
            if(count[arr[k]-1] >0 )
            {
            System.out.println("count of element "+arr[k]+" is "+count[arr[k]-1]);
            count[arr[k]-1]=0;
            }
        }
        
    }
}