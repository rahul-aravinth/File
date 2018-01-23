import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class sor{
    public static void main(String aa[]){
   
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int k=s.nextInt();
    LinkedHashSet<Integer>f=new LinkedHashSet<Integer>();
    for(int i=1;i<=a;i++){
       int c=s.nextInt();
       f.add(c);
    }
    ArrayList<Integer>x=new ArrayList<Integer>(f);
    Collections.sort(x);
    System.out.println(x.get(k-1));

}
}
