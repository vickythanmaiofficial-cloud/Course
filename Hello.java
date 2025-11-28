import java.util.*;
class Hello
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int tokens[]=new int[256];
        char arr[]=s.toCharArray();
        for(char c : arr)
        { 
            if(tokens[c]<1)
                tokens[c]++;
        }
            for(char c : arr)
            {
                if(tokens[c]==1)
                {
                    System.out.print(c);
                    tokens[c]--;
                }
                
       

}
    }
}
