class Solution {
    //dfs
    int count;
    int[][] dirs;
    int m ; int n;
    public int numIslands(char[][] grid) {
        count=0;
        if(grid==null || grid.length ==0) return count;
        dirs =  new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        m = grid.length;
        n = grid[0].length;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == '1') {
                    dfs(grid,i,j);
                    count++;
                }                
            }
        }
        
        return count;        
    }
    private void dfs(char[][] grid,int i,int j){
        //base
        if(i<0 || i>=m || j <0 || j >=n ||grid[i][j] == '0' ) return;
        
        //logic
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
            for(int[] dir:dirs){
                int x = dir[0]+i;
                int y = dir[1]+j;
                dfs(grid,x,y);
            }            
        }
        
        
    }
}