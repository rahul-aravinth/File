import java.io.*;
import java.util.*;
class PosorNeg
{
public static void main(String s[])
{
int a;
Scanner sc=new Scanner(System.in)
a=sc.nextInt();
if(a>0)
System.out.println("positive");
else if(a<0)
System.out.println("negative");
else
System.out.println("zero");
}
}
