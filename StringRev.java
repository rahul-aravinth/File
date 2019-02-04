import java.io.*;
import java.util.*;
class Stringrev {
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner (System.in);
	    String c=sc.next();
	    StringBuffer sb=new StringBuffer(c);
	    
		System.out.println(sb.reverse());
	}
}
