class Solution {
    int[] directions = { -1, 0, +1};
    int n;
    int m;
    public int maxMoves(int[][] grid) {
        int res = 0;
        n = grid.length;
        m = grid[0].length;
        int[][] t = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                t[i][j] = -1;
            }
        }
        for(int row = 0; row < n; row++) {
            res = Math.max(res, dfs(row, 0, grid, t));
        }
        return res;
    }
    
    int dfs(int row, int col, int[][] grid, int[][] t) {
        int moves = 0;
        if(t[row][col] != -1) {
            return t[row][col];
        }
        for(int dir : directions) {
            int newRow = row + dir;
            int newCol = col + 1;
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] > grid[row][col]) {
                moves = Math.max(moves, 1 + dfs(newRow, newCol, grid, t));
            }
        }
        return t[row][col] = moves;
    }
}