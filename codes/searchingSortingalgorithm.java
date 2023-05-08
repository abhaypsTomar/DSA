import java.util.Arrays;

public class searchingSortingalgorithm {
    public static void main(String[] args){
        int[] arr ={5,4,3,1,2};
        int target = 5;
        int ans = linearSearch(arr, target);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
           if(element == target){
                return i;
            }
           
        }
        return -1;
    }
        
    
    static int BinrarySearch(int[] arr,int  target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid =start + (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start =mid +1;
            }
            else{
                return mid;
            }
           
        }
        return -1;
        
    }
    static void bubbleSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j= 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = getMax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMax(int[] arr,int start ,int end){
        int maxvlaue = start;
        for(int i=start;i<=end;i++){
            if(arr[maxvlaue]<arr[i]){
                maxvlaue = i;
            }
        }
        return maxvlaue;
    }
    static void swap(int[] arr,int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }
    static void insertionSort(int[] arr){
        for(int i  =0;i<arr.length-1;i++){
            for(int j =i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    
    }
    static void cyclicsort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    } 


    
}

