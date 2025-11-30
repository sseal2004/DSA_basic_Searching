class Solution {
    public int findNumbers(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
           ans += countDigits(nums[i]);
        }
        return ans;
        
    }

    static int countDigits(int num){
        int count=0;
        while(num >0){
            count++;
            num/=10;
        }
        int remarks=0;
        if(count % 2==0 ){
            remarks++;
            //return 1
        }
        return remarks;
        //return 0;

    }
}