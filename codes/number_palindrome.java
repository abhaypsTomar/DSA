import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean ans = isPalindrome(x);
        System.out.println(ans);

    }

    static boolean isPalindrome(int x) {
        int original = x;
        int ans = 0;
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            ans = ans * 10 + rem;

        }


        if (original == ans) {
            return true;
        }
        return false;
    }
}