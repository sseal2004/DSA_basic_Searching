class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[]newArr = new int [n+1];
        for(int i=0;i<=n;i++){
            newArr[i]=i;
        }
        Arrays.sort(nums);
        for(int i=0;i< n;i++){
            if(nums[i]!=newArr[i])return newArr[i];
        }
        
        return n;
    }
}