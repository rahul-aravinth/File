import java.util.*;
class CreateLargeNo {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s,t;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(arr[i]>arr[j]){
		         t=arr[i];
		         arr[i]=arr[j];
		         arr[j]=t;
		        }
		    }
		}
		s=0;
		for(int i=n-1,k=0;i>=0;i--){
	               int p=(int)Math.pow(10, i);
	               s=s+(arr[k]*p);
		   k++;
		}
		System.out.println(s);
			for(int i=0;i<n;i++){
		System.out.print(arr[i]+",");
		}
	}
}
