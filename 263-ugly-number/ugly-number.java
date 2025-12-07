class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        if(n==1)return true;
        int []nums ={2,3,5};
        for(int element : nums ){
            while(n%element==0){
                n/=element;
            }
        }
                return n==1; //30/2=15 15/3=5 5/5=1 hence n = 1 until 
    }
}