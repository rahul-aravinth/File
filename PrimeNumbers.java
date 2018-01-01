import java.util.*;
import java.lang.*;
public class PrimeNumbers{
      public static void main(String aa[]){
           int n,p;
           int f=0;
           int count=0;
           Scanner s=new Scanner(System.in);
           p=s.nextInt();
           n=s.nextInt();
           for(int i=p;i<=n;i++){
               for(int j=2;j<i;j++){
                   if(i%j==0){
                       f=0;
                       break;
                   }
               else{
                       f=1;
               }
               }
               if(f==1){
                   count++;

               }

           }
           System.out.print(count);

}
}
