import java.util.Scanner;
public class RevInt {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to Reverse :");
		int num = sc.nextInt();
		int temp;
		System.out.println("The Number after Reverse :");
		while(num!=0){
			temp=num%10;
			System.out.print(temp);
			num =num/10;
		}
	}
}
