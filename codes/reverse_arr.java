import java.util.Arrays;
import java.util.Scanner;

public class reverse_arr{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] arr = new String[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.next();
        }
        reverse_str(arr);
        System.out.println("Abhay fav Body parts:");
        System.out.println(Arrays.toString(arr));

    }
    static  void reverse_str(String arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
        static void swap (String arr[],int i, int j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

}