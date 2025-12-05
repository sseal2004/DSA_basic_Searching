class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;//take upto m element
        int j=0;
        while(j<n){
            nums1[i++]=nums2[j++];       
        }
        mergerSort(nums1,0,(m+n));
    }
    static void mergerSort(int[]arr,int s,int e){
       if(e-s<=1)return;
        int mid=(s+e)/2;
        mergerSort(arr,s,mid);
        mergerSort(arr,mid,e);
        merging(arr,s,mid,e);
    }
    static void merging(int[]arr,int s,int m,int e){
        if(e-s<=1)return ;
        int[]mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m&&j<e){
         if(arr[i]<arr[j]){
            mix[k]=arr[i];
            i++;
         }else{
            mix[k]=arr[j];
            j++;
         } 
         k++;  
        }
        while(i<m){
            mix[k++]=arr[i++];
        }
        while(j<e){
            mix[k++]=arr[j++];
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }

}