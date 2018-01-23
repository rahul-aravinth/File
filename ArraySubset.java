import java.util.*;
import java.math.*;
import java.lang.*;


public class ArraySubset
{
	static void tofind(int[] arr1, int[] arr2)
	{
		int a=arr1.length;
		int b=arr2.length;
		int i=0;	
		int flag=0;
		while(i<b)
		{
			flag=0;
			for(int j=0;j<a;j++)
			{
				if(arr2[i]==arr1[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("NO");
				break;
			}
			i++;
		}
		
		if(flag==1)
			System.out.println("YES");

	}
	public static void main(String[] args)
	{
		System.out.println("Enter number of elements in 2 arrays");
		Scanner sn = new Scanner(System.in);
		int a =sn.nextInt();
		int b=sn.nextInt();
		int[] arr1=new int[a];
		int[] arr2=new int[b];
		int i=0;
		System.out.println("Please enter "+a+" numbers in array 1");
		while(i<a)
		{
			arr1[i]=sn.nextInt();
			i++;
		}
		i=0;
		System.out.println("Please enter "+b+" numbers in array 2");
		while(i<b)
		{
			arr2[i]=sn.nextInt();
			i++;
		}
		tofind(arr1,arr2);		
	}	
}
