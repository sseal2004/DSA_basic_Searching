class Solution {
    public int majorityElement(int[] nums) {
        
        Mergesort(nums,0,nums.length);
        int count=0;
        int element=0;
        for(int i =0;i<nums.length;i++){
            if(count==0)
            element = nums[i];
            if(nums[i]==element)count++;
            else
            count--;
        }
        return element;


    }
    static void merge(int[]arr,int start,int mid,int end){
        int []mix = new int [end-start];
        //declare 3 pointer
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j < end ){
            
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
            while(i<mid){
                mix[k] = arr[i];
                i++;
                k++;
            }
            while(j<end){
                mix[k]=arr[j];
                j++;
                k++;
            }
            for(int l=0;l<mix.length;l++){
                arr[start+l]=mix[l];
            }

        
    }

    static void Mergesort(int[]arr,int start,int end){
                if(end-start <=1) return;

        int mid = (start+end)/2;


        Mergesort(arr,start,mid);
        Mergesort(arr,mid,end);

        merge(arr,start,mid,end);
    }
}