import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class max_array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //ArrayList<Integer>list=new ArrayList<>(5);
        int[] arr =new int[5];
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        int ans = maximum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }
    static int maximum(int[] arr){
        int max_value=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }

        }
        return max_value;

    }
}
