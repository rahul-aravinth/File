import java.io.DataInputStream;
import java.io.IOException;
public class StringToInt {
	public static void main(String args[])throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		System .out.println("Enter a String :");
		String str = dis.readLine();
		int num=0;
		try{
		num = Integer.parseInt(str);
		System.out.println("The String is converted to integer");
		System.out.println("THe Integer is :"+num);
		}
		catch(Exception e){
			System.out.println("Enter an integer please!!!");
		}
	}
}
