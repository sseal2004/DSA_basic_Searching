class Solution {
    public int thirdMax(int[] arr) {
        long max = Long.MIN_VALUE;
        long smax= Long.MIN_VALUE;
        long tmax =Long.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if (arr[i] == max || arr[i] == smax || arr[i] == tmax)
                continue;

            if (arr[i] > max) {
                tmax = smax;
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax) {
                tmax = smax;
                smax = arr[i];
            }
            else if (arr[i] > tmax) {
                tmax = arr[i];
            }
        }
        return (tmax==Long.MIN_VALUE)?(int)max:(int)tmax;
    }
}