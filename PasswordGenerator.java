
import java.util.Random;
public class PasswordGenerator{
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String nums="0123456789";
        String all=upper+lower+nums;
        String s1="";
        Random rand1=new Random();
        int r1=rand1.nextInt(26);
        s1=s1+upper.substring(r1,r1+1)+lower.substring(r1,r1+1)+nums.substring(1,5);
        
        System.out.println(s1);
    }
}
