
import java.util.Scanner;


public class percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter mark of subject 1");
        float a=sc.nextInt();
        System.out.println("Enter mark of subject 2");
        float b=sc.nextInt();
        System.out.println("Enter mark of subject 3");
        float c=sc.nextInt();
        System.out.println("Enter mark of subject 4");
        float d=sc.nextInt();
        System.out.println("Enter mark of subject 5");
        float e=sc.nextInt();

        float per=(a+b+c+d+e)/500*100;
        System.out.print("Your percentage is ");
        System.out.println(per);


    }
}
