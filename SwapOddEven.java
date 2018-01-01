import java.util.*;
public class SwapOddEven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        String b="";
        String con="";
        String ans="";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0 && i<s.length()-1)
            {
                char temp=c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
                a=Character.toString(c[i]);
                b=Character.toString(c[i+1]);
                con=a.concat(b);
                ans=ans.concat(con);
            }
            else if(i==s.length()-1)
            {
                ans=ans.concat(Character.toString(c[i]));
            }
            i++;
        }
        System.out.println(ans);
    }
}
