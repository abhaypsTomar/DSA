import java.util.Scanner;
public class alphabet_case {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        char ch = val.next().trim().charAt(0);

        if(ch >= 'a' && ch <='z'){
            System.out.println("LOWER CASE");
        }else{
            System.out.println("UPPER CASE");
        }

    }
}
