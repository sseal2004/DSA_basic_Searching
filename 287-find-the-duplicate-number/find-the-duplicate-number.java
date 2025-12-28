class Solution {
    public int findDuplicate(int[] nums) {
    // Cyclic sort
    cyclicSort(nums);
    //1 2 2 3 4
    //find that duplicate 
    for(int index = 0; index < nums.length; index++){
    if(nums[index] != index + 1){
        return nums[index];  // ← return duplicate
    }
}


    return nums.length;
    }
    static void cyclicSort(int[]arr){
        int i=0;
        while(i<arr.length){
            int currentElement = arr[i]-1;
             if( arr[i]!=arr[currentElement]){
                //swap
                int temp=arr[i];
                arr[i]=arr[currentElement];
                arr[currentElement]=temp;
             }
             else{
                i++;
             }
        }
    }
    
}