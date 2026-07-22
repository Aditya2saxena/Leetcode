class Solution {
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            // last bit nikalo
            int bit = n & 1;

            // answer ko left shift karo
            ans = ans << 1;

            // bit add karo
            ans = ans | bit;

            // next bit ke liye right shift
            n = n >> 1;
        }

        return ans;
    }
}