import java.util.*;
class Second_char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=s.toCharArray();
        int tokens[]=new int[26];
        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i];
            tokens[c-'a']++;
        }
        int first_count=-1;
        int first_char=-1;
        int second_count=-1;
        int second_char=-1;
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i]>first_count)
            {
                second_count=first_count;
                second_char=first_char;

                first_count=tokens[i];
                first_char=i;
            }
            else if(tokens[i]==first_count)
            {
                if(i!=first_char && tokens[i]>second_count)
                {
                    second_count=tokens[i];
                    second_char=i;
                }
            }
            else if(tokens[i]>second_count)
            {
                second_count=tokens[i];
                second_char=i;
            }
        }
        
            if(first_count==-1 || second_count==-1)
            {
                System.out.println("no character found");
            }
            else
            {
                System.out.println("first max character is "+(char)('a'+first_char)+" : "+first_count+" times");
                 System.out.println("second max character is "+(char)('a'+second_char)+" : "+second_count+" times");

            }
        }
    }
