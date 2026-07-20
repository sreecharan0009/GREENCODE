class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int idx=i*m+j;
                int newidx=(idx+k)%(n*m);
                int newrow=newidx/m;
                int newcol=newidx%m;
                ans[newrow][newcol]=grid[i][j];
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(ans[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}