import java.util.*;
import java.util.ArrayList;
public class FirstRepeat{
      public static void main(String aa[]){
            int n;
            int f=0;
             Scanner s=new Scanner(System.in);
             n=s.nextInt();
             int pp=0;
             int count=0;
             int a[]=new int[n];
              ArrayList<Integer>d=new ArrayList<Integer>();
             for(int i=0;i<n;i++){
                 a[i]=s.nextInt();
             }
             for(int i=0;i<n;i++){
                 for(int j=0;j<n;j++){
                     if(a[i]==a[j]){
                         count++;
                     }
                 }
                 if(count<=1){
                  d.add(a[i]);
                 }
  
                 count=0;
             }
             for(int y:d){
                 System.out.print(y);
             }
             
         

    }
}
