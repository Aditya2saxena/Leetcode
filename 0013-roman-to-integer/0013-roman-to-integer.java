
class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = 0;
            int next = 0;

            char ch = s.charAt(i);

            if (ch == 'I') curr = 1;
            else if (ch == 'V') curr = 5;
            else if (ch == 'X') curr = 10;
            else if (ch == 'L') curr = 50;
            else if (ch == 'C') curr = 100;
            else if (ch == 'D') curr = 500;
            else if (ch == 'M') curr = 1000;

            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);

                if (nextChar == 'I') next = 1;
                else if (nextChar == 'V') next = 5;
                else if (nextChar == 'X') next = 10;
                else if (nextChar == 'L') next = 50;
                else if (nextChar == 'C') next = 100;
                else if (nextChar == 'D') next = 500;
                else if (nextChar == 'M') next = 1000;
            }

            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }

        return sum;
    }
}
