import java.util.Arrays;

public class Bubble {
    public static void main(String[] args){
        int [] arr ={1,2,4,3,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        for(int i =0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            swapped = true;

        }


    }
}
