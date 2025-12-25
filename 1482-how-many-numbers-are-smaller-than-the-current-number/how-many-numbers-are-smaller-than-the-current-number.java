class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int []result = new int[nums.length];
        //8,1,2,2,3
        //1 2 2 3 8

        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<sorted.length;j++){
            if (sorted[j] == nums[i]) {
                    result[i] = j;
                    break;
                }
            }
        }
            return result;

    }
}