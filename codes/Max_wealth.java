import java.util.Scanner;

public class Max_wealth {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r,c;
        r = in.nextInt();
        c= in.nextInt();
        int[][] Acc = new int [r][c];
        for(int row = 0;row<Acc.length;row++){
            for(int col = 0;col<Acc[row].length;col++){
                Acc[row][col] = in.nextInt();
            }
        }


    }
    static int solve(int[][] Acc){
        int ans = Integer.MIN_VALUE;
        for(int row = 0;row<Acc.length;row++){
            int sum=0;
            for(int col =0 ;col<Acc[row].length;col++){
                sum+=Acc[row][col];
            }
            if(sum > ans ){
                sum = ans;
            }
        }
        return ans;
    }
}
