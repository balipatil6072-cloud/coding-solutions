class Solution {
    public int mySqrt(int x) {
        if (x <= 1)
            return x;

        for (long i = 1; i <=x / 2; i++) {
            if (i * i > x)
                return (int)(i-1);

        }
        return x / 2;
    }

}