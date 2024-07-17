class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for (int i = 0; i < x.size(); i++) {
            int z = x.get(i);
            for (int j = 0; j < m; j++) {
                matrix[z][j] = 0;
            }
        }
        for (int i = 0; i < y.size(); i++) {
            int c = y.get(i);
            for (int j = 0; j < n; j++) {
                matrix[j][c] = 0;
            }
        }

    }
}