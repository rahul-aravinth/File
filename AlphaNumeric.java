import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class AlphaNumeric{
     public static void main(String aa[]){
      int a;
      String dd=" ";
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      String b=String.valueOf(a);
      char c[]=b.toCharArray();
      HashMap<Integer,Character>p=new HashMap<Integer, Character>();
      char v='A';
      int count=0;
      for(int i=1;i<26;i++){
          p.put(i, v);
          v++;
      }
      for(int i=0;i<c.length;i++){
          int c1=Character.getNumericValue(c[i]);
          if(p.containsKey(c1)){
          char t=  p.get(c1);
          dd=dd+t;
          count++;
          }
      }
      System.out.println(dd);
      System.out.println(count-1);
     

    }
}
