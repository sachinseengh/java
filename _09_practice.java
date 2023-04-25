

import java.util.Scanner;

public class _09_practice {
    public static void main(String[] args) {
    
    Scanner  sc = new Scanner(System.in);
    int a=5;
    System.out.println("Enter your number:");
    int b=sc.nextInt();

    if(a>b){
        System.out.println("your number is smaller");
    }else{
        System.out.println("Your number is greater");
    }

    }
}
