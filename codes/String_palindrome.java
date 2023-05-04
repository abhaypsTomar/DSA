import java.util.*;
import java.lang.String;

public class String_palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next().trim();
        boolean Ans = check(str);
        if (Ans){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }

    static boolean check(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if (str.charAt(i)==str.charAt(j)) {
                i++;
                j--;
            }
            else{
                return false;

            }
        }
        return true;


    }
}