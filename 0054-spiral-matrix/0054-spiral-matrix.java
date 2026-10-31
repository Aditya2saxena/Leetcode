class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startingRow = 0;
        int endingRow = matrix.length - 1;

        int startingCol = 0;
        int endingCol = matrix[0].length - 1;

        while (startingRow <= endingRow &&
               startingCol <= endingCol) {

            // Left to Right
            for (int i = startingCol; i <= endingCol; i++) {
                ans.add(matrix[startingRow][i]);
            }
            startingRow++;

            // Top to Bottom
            for (int i = startingRow; i <= endingRow; i++) {
                ans.add(matrix[i][endingCol]);
            }
            endingCol--;

            // Right to Left
            if (startingRow <= endingRow) {
                for (int i = endingCol; i >= startingCol; i--) {
                    ans.add(matrix[endingRow][i]);
                }
                endingRow--;
            }

            // Bottom to Top
            if (startingCol <= endingCol) {
                for (int i = endingRow; i >= startingRow; i--) {
                    ans.add(matrix[i][startingCol]);
                }
                startingCol++;
            }
        }

        return ans;
    }
}