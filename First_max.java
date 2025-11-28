 import java.util.*;

class First_max
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
        int greatest=0;
        int max_count=0;
        for( int t=0;t<26;t++)
        {
            if(max_count<tokens[t])
            {
                max_count=tokens[t];
                greatest=t;

        }   
        }   
        char max_char=(char)((int)'a'+greatest);      
        System.out.println(max_char+" : "+ max_count+" times");

        
                       
        
        
    }
} 