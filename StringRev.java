import java.io.*;
public class SringRev {
	public static void main(String args[])throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		System .out.println("Enter a String :");
		String str = dis.readLine();
		String rstr = new StringBuffer(str).reverse().toString();
		System.out.println("The String after reversing : "+rstr);
		
	}
}
