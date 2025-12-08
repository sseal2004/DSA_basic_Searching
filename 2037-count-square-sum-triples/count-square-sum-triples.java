class Solution {
    public int countTriples(int n) {
        int a, b;
        int count = 0;

        for (a = 1; a <= n; a++) {
            for (b = a + 1; b <= n; b++) {

                int sum = (a * a) + (b * b);
                int x = (int) Math.sqrt(sum);

                if (x <= n && x * x == sum) {
                    count+=2;
                }
            }
        }

        return count;
    }
}
