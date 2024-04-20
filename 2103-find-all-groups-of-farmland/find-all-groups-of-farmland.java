class Solution {
     List<List<Integer>> ans;
    int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int m, n;

    public int[] dfs(int[][] land, int i, int j, int r2, int c2) {
        land[i][j] = 0;
        r2 = Math.max(r2, i);
        c2 = Math.max(c2, j);
        for (int[] d : dir) {
            int i_ = i + d[0];
            int j_ = j + d[1];
            if (i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && land[i_][j_] == 1) {
                int[] result = dfs(land, i_, j_, r2, c2);
                r2 = Math.max(r2, result[0]);
                c2 = Math.max(c2, result[1]);
            }
        }
        return new int[]{r2, c2};
    }

    public int[][] findFarmland(int[][] land) {
        m = land.length;
        n = land[0].length;
        ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int r1 = i;
                    int c1 = j;
                    int r2 = -1;
                    int c2 = -1;
                    int[] r2c2 = dfs(land, i, j, r1, c1);
                    ans.add(List.of(r1, c1, r2c2[0], r2c2[1]));
                }
            }
        }
        int[][] res = new int[ans.size()][4];
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = ans.get(i).get(j);
            }
        }
        return res;
    }
}