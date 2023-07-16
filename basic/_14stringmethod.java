import java.util.concurrent.CountDownLatch;

public class _14stringmethod {
    public static void main(String[] args) {
         String name="Sachin";
         int n=name.length();
         System.out.println(n);
         String Lower=name.toLowerCase() ;
         System.out.println(Lower);

         String nontrim="       Sachin  singh";
         System.out.println(nontrim);
         String trim=nontrim.trim();
         System.out.println(trim);
    }
}
