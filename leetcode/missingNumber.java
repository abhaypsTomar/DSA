package leetcode;

public class missingNumber{
    public static void main(String[] args){
        int[] num ={4,0,1,2};
        int[] arr = {3,0,1};
        System.out.println(optimized(arr));

    }
    static int optimized(int[] arr){
        int sum = (arr.length+1)*arr.length/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2 = sum2+arr[i];

        }
        return sum-sum2;
    }
    static int founded(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length &&  nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index =0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}


