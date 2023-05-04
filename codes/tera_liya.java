import java.util.Scanner;
public class tera_liya {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num  = in.nextInt();
        System.out.println(arm_num(num));

    }
    static boolean arm_num(int num){
        int original = num;
        int sum =0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            sum = sum + rem*rem*rem;

        }
        if (sum==original){




            return true;
        }
        return false;
    }
}
