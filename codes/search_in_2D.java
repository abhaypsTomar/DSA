import java.util.Scanner;
public class search_in_2D {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int i =in.nextInt();
            int j = in.nextInt();
            int arr[][] = new int[i][j];
            for(int row = 0;row<arr.length;row++){
                for(int col = 0;col<arr[row].length;col++){
                    arr[row][col]=in.nextInt();
                }
            }
            int target = in.nextInt();
        System.out.println(search_2D(arr,target));
    }
    static int search_2D(int[][] arr,int target){
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
            int element=arr[row][col];
            if(element==target){
                return 0;
            }
            }
        }
        return -1;


    }
}
