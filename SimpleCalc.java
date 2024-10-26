
import static java.lang.Math.pow;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
public class SimpleCalc {
    public static void main(String[] args){
        int num1=10;
        int num2=2;
        int sum=num1+num2;
        int diff=num1-num2;
        int mul=num1*num2;
        float div=num1/num2;
        int quo=num1/num2;
        int rem=num1%num2;
        int exp=(int)pow(num1,num2);
        System.out.println("Sum is"+sum);
        System.out.println("Diff is"+diff);
        System.out.println("Product is"+mul);
        System.out.println("Division is"+div);
        System.out.println("Quotient is"+quo);
        System.out.println("Remainder is"+rem);
        System.out.println("Exponential is"+exp);
      
    }
}
