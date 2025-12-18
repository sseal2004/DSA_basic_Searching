class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int min =Integer.MAX_VALUE;
        Arrays.sort(nums);
       for(int i=0;i<n;i+=2){
        for(int j=i+1;j<n;j+=2){
        min = Math.min(nums[i],nums[j]);

        }
        sum +=min;
       }
       return sum;
    }
}