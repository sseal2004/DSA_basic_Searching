class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end =  arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if((arr[mid]-(mid+1)) >=k){
              //2-(0index +1)=1<k  //3-(1index +1)=1 <k//4-(2index +1) =1<k missing //7-(3 index +1) = 3<k //11-(4 intdex +1)= 6>k
                end = mid -1;//shift prev index
                // so here end = 5th missing positive integer 
            }
            else{
                start = mid +1;//shift next index
            }
        }
        return start + k;//4 +5;for test case 1 =9
        //2+4 for test case 2 = 6

    }

}