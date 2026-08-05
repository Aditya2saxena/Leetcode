class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c = 0;
        boolean[] used = new boolean[baskets.length];

        for (int i = 0; i < fruits.length; i++) {

            boolean placed = false;

            for (int j = 0; j < baskets.length; j++) {

                if (!used[j] && fruits[i] <= baskets[j]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                c++;
            }
        }

        return c;
    }
}