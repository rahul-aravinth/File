import java.util.*;
import java.lang.*;
public class LargestPrefix {
     public static void main(String aa[]){
         try{
       String a;
       String b;
       int pp=0;
       int ss=0;
       int ff;
       int lp=0;
       int ppp=0;
       String c[]=new String[100];
       String d[]=new String[100];
       Scanner s=new Scanner(System.in);
       a=s.next();
       b=s.next();
       char e[]=a.toCharArray();
       char f[]=b.toCharArray();
       int l=a.length();
       int n=b.length();
       for(int i=0;i<l;i++){
           for(int j=i+1;j<l;j++){
               String v=a.substring(i, j);
               int p=v.length();
               if(p>1){
                   c[pp]=v;
                   pp++;
                   ss++;
               }
           }
       }
       pp=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               String m=b.substring(i, j);
               int kk=b.length();
               if(kk>1){
                   d[pp]=m;
                   pp++;
                   ppp++;
               }
           }
       }
       if(ss>pp){
            ff=ss;
       }
 else{
           ff=pp;
 }
       for(int i=0;i<ff;i++){
           for(int j=0;j<ff;j++){
               if(c[i].equals(d[j])){
                   if(lp==0){
                  System.out.println(c[i]);
                  lp++;
                   }
               }
              

               }
             
           }
       }
         catch(Exception e){
             
         }
    }

      
}
