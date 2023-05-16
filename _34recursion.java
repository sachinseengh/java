
import java.util.Scanner;


public class _34recursion {




    static int fact(int n){

        if(n==1 || n==0
        ){
            return 1;
        }
        return (n*fact(n-1));
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int input=sc.nextInt();
       int f= fact(input);
       System.out.println(f);
    }
}
