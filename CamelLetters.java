import java.util.*;
public class CamelLetters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        char f=s.charAt(0);
        r=r+Character.toUpperCase(f);
        char c[]=s.toCharArray();
        for(int i=1;i<s.length();i++)
        {
            char cur=c[i];
            char pre=c[i-1];
            if(pre==' ')
            {
                r=r+Character.toUpperCase(cur);
            }
            else
            {
                r=r+Character.toString(cur);
            }
        }
        System.out.println(r);
        
    }
}
