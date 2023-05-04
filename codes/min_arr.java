import java.util.Scanner;
public class min_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();


        }
        System.out.println(min_search(arr));
    }

    static int min_search(int[] arr) {
        int min_value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min_value) {
                min_value = arr[i];
            }
        }
        return min_value;
    }
}

