class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int[] freq=new int[size+1];
        int repeated=-1;int missing=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                int num=grid[i][j];
                freq[num]++;
            }
        }
        for(int num=0;num<=size;num++){
            if(freq[num]==0){
                missing=num;
            }
            if(freq[num]==2){
                repeated=num;
            }
        }
        return new int[]{repeated,missing};
    }
}