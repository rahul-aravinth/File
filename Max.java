import java.io.*;
import java.util.*;

public class Max {
	public static void main(String args[])throws IOException{
		Scanner sc=new Scanner(System.in);
		int ary[]=new int[25];
		int max=0;
		try{
		for(int i=1;i<=25;i++){
			System.out.println("Enter number for element ary["+i+"]:");
			ary[i]=sc.nextInt();
			max=(ary[i]>max?max=ary[i]:max);
		}
		}
		catch(Exception e){}
		System.out.println("Maximux Value in the array is :"+max);
	}
}
