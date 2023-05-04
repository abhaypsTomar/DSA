import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = armstrong_num(num);
        System.out.println(ans);

    }
    static boolean armstrong_num(int num) {
        int orignal=num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum==orignal){
            return true;
        }
        return false;

    }
}
