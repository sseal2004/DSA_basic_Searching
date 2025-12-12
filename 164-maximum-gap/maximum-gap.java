class Solution {
    public int maximumGap(int[] nums) {
        
        if(nums.length<=1)return 0;
        quickSort(nums,0,nums.length-1);
        int max = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
                int diff = nums[i]-nums[i-1];
                max = Math.max(max,diff);
            }
        
        return max;
    }
    public static void quickSort(int []arr,int low,int high){
        if(low>=high)return ;
        int start=low;
        int end= high;
        int mid = start+(end-start)/2;
        
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                 arr[start]= arr[end];
                  arr[end]=temp;
                  start++;
                  end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);


    }
}