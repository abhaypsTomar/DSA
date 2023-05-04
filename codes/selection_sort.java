import java.util.Arrays;
import java.util.Scanner;
public class selection_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }

        }
    }
    static void selection(int[] arr){
        for (int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
         arr[j]=temp;
    }
    static int getMaxIndex(int[] arr,int start ,int end){
        int max = start;
        for(int i = start ; i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;

    }
}