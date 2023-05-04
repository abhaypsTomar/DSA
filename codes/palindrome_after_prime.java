import org.w3c.dom.ls.LSInput;

import java.sql.SQLOutput;
import java.util.*;
public class palindrome_after_prime {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        boolean check = prime(num);
        if (check){
            System.out.println("is prime");

        }else{
            System.out.println("not prime");
        }

    }
    static boolean prime(int num){
        for(int i =2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;





    }
}
