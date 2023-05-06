import java.util.Arrays;
import java.util.Scanner;
public class asc_dsc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int target = in.nextInt();
        int ans = binaray_search(arr, target);
        System.out.println(ans);
    }
    /**
     * @param arr
     * @param target
     * @return
     */
    static int binaray_search(int[] arr , int target){
        int start =0;
        int end = arr.length -1;


        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == mid){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else
            {
                    if(target>arr[mid]){
                        end = mid -1;
                    }else {
                        start = mid+1;
                    }
                }
        }
        return -1;


    }
}
