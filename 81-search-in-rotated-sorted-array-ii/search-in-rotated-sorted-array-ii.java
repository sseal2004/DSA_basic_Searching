class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length ==0){
            return false;
        }
        reverse(nums);
        //linear search
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
    static void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];//store ir in temp variable
        arr[index1]=arr[index2];//update arr[index2]
        arr[index2]=temp;
    }
    static void reverse(int[]nums){
        int start =0;
        int end = nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}