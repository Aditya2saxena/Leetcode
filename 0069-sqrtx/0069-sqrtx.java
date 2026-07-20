class Solution {
    public int mySqrt(int x) {

        int ans = 0;
        int i = 0;

        while (i <= x) {

            if ((long) i * i <= x) {
                ans = i;
                i++;
            } else {
                return i-1;
            }
        }

        return ans;
    }
}