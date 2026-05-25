class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int res[][] = new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int col=0;
            for(int j=image[0].length-1;j>=0;j--){
                res[i][col] = image[i][j];
                col++;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(res[i][j]==1){
                    res[i][j]=0;
                }
                else{
                    res[i][j]=1;
                }
            }
        }
        return res;
    }
}