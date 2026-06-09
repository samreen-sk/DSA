class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    if(check(i,j,n,m,mat)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private boolean check(int r, int c,int n, int m,int[][] mat){
        for(int i=0;i<m;i++){
            if(mat[r][i]==1 && i!=c) return false;
        }
        for(int i=0;i<n;i++){
            if(mat[i][c]==1 && i!=r) return false;
        }
        return true;
    }
}