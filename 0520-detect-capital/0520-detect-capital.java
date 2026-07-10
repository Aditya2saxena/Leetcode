class Solution {
    public boolean detectCapitalUse(String word) {

        int count = 0;

        // Count uppercase letters
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        // Case 1: All letters uppercase
        if (count == word.length()) {
            return true;
        }

        // Case 2: All letters lowercase
        if (count == 0) {
            return true;
        }

        // Case 3: Only first letter uppercase
        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}