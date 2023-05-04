import java.util.Scanner;
public class Search_in_range {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(find(arr,target,1,3));
    }
    static int find( int[] arr,int target,int start, int end){
        if (arr.length==0){
            return -1;
        }

        for(int i=start;i<end;i++){
            int element = arr[i];
            if(element==target){
                return 0;
            }
        }
        return -1;
    }

}
