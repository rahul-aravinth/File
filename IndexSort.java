import java.util.*;
import java.io.*;
public class IndexSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int ct=0;
		int a[] = new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();

		}
		for(int i=0;i<n;i++) {
			if(a[i]==i) {
				System.out.print(a[i]+" ");
				ct++;
			}
		}
		if(ct==0) {
			System.out.println("No matching index found");
		}
	}
}
