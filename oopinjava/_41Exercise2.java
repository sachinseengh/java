
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;



public class _41Exercise2 {
    public static void main(String[] args) {
        
        Random sc=new Random();
        int computerinput=sc.nextInt(3);
        



    Scanner scc=new Scanner(System.in);
    System.out.println("Enter your guess,0 for rock,1 for paper and 2 for scissors");
    int userinput=scc.nextInt();
    System.out.println("Computer guess is "+computerinput);
    if((userinput==1 && computerinput==0) || (userinput==0 && computerinput==2)||(userinput==2 && computerinput==1)){
        System.out.println("You win");
    }else{
        System.out.println("You lose");
    }
    }

   
    
}
