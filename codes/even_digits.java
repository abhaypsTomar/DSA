import java.util.Scanner;
public class even_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){
        int ans=0;
        for(int i = 0; i<arr.length;i++)
        {
            int digits = arr[i];
            int count =0;
            while(digits!=0){
                digits = digits/10;
                count++;

            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}