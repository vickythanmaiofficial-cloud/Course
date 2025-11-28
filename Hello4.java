import java.util.*;
class Hello3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("duplicate elements are : ");
        for(int j=0;j<n;j++)
        {
            if(visited[j]==true)
                continue;
            
            for(int k=j+1;k<n;k++)
            {
                if(arr[j]==arr[k])
                {
                    count++;
                    visited[k]=true;
                }
            }
            if(count>0)
                 System.out.println(arr[j]+" ");
        }
    }
}