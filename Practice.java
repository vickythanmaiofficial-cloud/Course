
import java.util.*;

class Practice 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        s=s.toLowerCase();
        char arr[]=s.toCharArray();
        int tokens[]=new int[26];
        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i];
            tokens[c-'a']++;
        }
        int greatest=-1;
        int sec_greatest=-1;
        int max_count=-1;
        int sec_max_count=-1;
        for( int t=0;t<26;t++)
        {
            if(max_count<tokens[t])
            {
                max_count=tokens[t];
                greatest=t;

        }   
        }   

        for( int j=0;j<26;j++)
        {
            if(sec_max_count<tokens[j] && j!=greatest)
            {
                sec_max_count=tokens[j];
                sec_greatest=j;

        }   
        }  
        if(max_count==-1)
        {
            System.out.println("no characters found");
        }
        else if(sec_max_count<=0)
            System.out.println("no valid 2nd max char");
        else{

        
        System.out.println((char)('a'+greatest)+" : "+ max_count+" times");
        System.out.println((char)('a'+sec_greatest)+" : "+sec_max_count+" times");
        }

        
        
                       
        
        
    }
}