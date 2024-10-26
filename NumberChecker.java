
import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc1.nextInt();
        if(n>0)
               System.out.println("Number is positive");
        else if(n<0)
               System.out.println("Number is negative");
        else
               System.out.println("Number is zero");
    }
}

