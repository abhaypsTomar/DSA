import java.util.Arrays;
import java.util.Scanner;
public class linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int ans =  linear_Search(arr,target);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static int linear_Search(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}