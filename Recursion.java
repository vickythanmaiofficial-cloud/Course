import java.util.*;
class Recursion
{
    
    static void reverse(int arr[],int start,int end)
        {
          if(start>=end)
            return;
          
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;

          reverse(arr,start+1,end-1);
        }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,5,2,7,1};
        reverse(arr,0,arr.length-1);

        for(int ele : arr)
        {
          System.out.print(ele+" ");
        }
        
       
        
    }
}