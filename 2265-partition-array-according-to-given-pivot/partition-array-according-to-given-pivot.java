class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int idx = 0;

        // elements < pivot
        for (int num : nums) {
            if (num < pivot) {
                result[idx++] = num;
            }
        }

        // elements == pivot
        for (int num : nums) {
            if (num == pivot) {
                result[idx++] = num;
            }
        }

        // elements > pivot
        for (int num : nums) {
            if (num > pivot) {
                result[idx++] = num;
            }
        }

        return result;
    }
}
