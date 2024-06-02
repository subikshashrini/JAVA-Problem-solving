public class island {
    private int rows;
    private int cols;

    public int numIslands(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        rows = matrix.length;
        cols = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    count++;
                    markzero(matrix, i, j);//0 0
                }
            }
        }

        return count;
    }

    private void markzero(char[][] matrixx, int row, int col)
    {
        if (row < 0 || col < 0 || row >= rows || col >= cols
                || matrixx[row][col] != '1') {
            return;
        }

        matrixx[row][col] = '0';// 2 3

        markzero(matrixx, row + 1, col);//up
        markzero(matrixx, row - 1, col);// down
        markzero(matrixx, row, col + 1);//right
        markzero(matrixx, row, col - 1);//left
        markzero(matrixx, row + 1, col + 1);//ne
        markzero(matrixx, row - 1, col - 1);//nw
        markzero(matrixx, row + 1, col - 1);//se
        markzero(matrixx, row - 1, col + 1);//sw
    }

    public static void main(String[] args) {
        char[][] mat = {
                /*{'1', '1', '0', '0', '0'},
                {'0', '1', '0', '0', '1'},
                {'1', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '0', '1', '0', '0'}*/
                {'1','1','1'},{'1','1','1'},{'1','1','1'}
        };

        island islands = new island();
        System.out.println("Number of islands: " + islands.numIslands(mat));
    }
}