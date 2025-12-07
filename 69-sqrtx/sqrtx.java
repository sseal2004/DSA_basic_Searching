class Solution {
    public int mySqrt(int x) {
       int sqrt = (int) pow(x, 0.5);
       return sqrt;
    }

    static double pow(double base, double exp){
        return Math.pow(base, exp);
    }
}
