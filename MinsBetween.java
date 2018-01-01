import java.util.Scanner;
    public class MinsBetween
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	int m=sc.nextInt();int res=0;
        	if(n<m)
        		res=m-n;
        	else
        		res=(m+12)-n;
       		System.out.println(res*60);
        }
}
