//https://leetcode.com/problems/flood-fill/

class Solution {
    public void paint(int row, int column, int[][]image, int newColor,int oldColor){
     
         if(row < 0 || column <0 || row >= image.length || column >= image[0].length || image[row][column] ==           newColor){
            return;
         }
        
               if(image[row][column] == oldColor){
                     image[row][column] = newColor;
               

                     paint(row-1,column, image, newColor, oldColor);
                     paint(row+1,column, image, newColor, oldColor);
                     paint(row,column+1, image, newColor, oldColor);
                     paint(row,column-1, image, newColor, oldColor);
               }
       //return image; 
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
         paint(sr, sc, image, newColor, image[sr][sc]);
       return image;
    }
}
