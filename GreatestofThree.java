import java.io.*;
import java.util.*;
class GreatestofThree
{
public static void main(String s[])
{
int a,b,c,d;
Scanner sc=new Scanner(String s[])
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
d=a>b?(a>c?a:c):(b>c?b:c);
System.out.print(d);
}
}
