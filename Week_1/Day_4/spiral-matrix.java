// Problem Name : Spiral Matrix
// Problem Link : https://leetcode.com/problems/spiral-matrix/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        int firstRow = 0, lastRow = m-1,firstCol = 0,lastCol = n-1,t=m*n;
        while(ans.size()<t){
            for(int i=firstCol;i<=lastCol;i++){
                ans.add(matrix[firstRow][i]);
            }
            firstRow++;
            if(ans.size()==t) break;
            for(int i=firstRow;i<=lastRow;i++){
                ans.add(matrix[i][lastCol]);
            }
            lastCol--;
            if(ans.size()==t) break;
            for(int i=lastCol;i>=firstCol;i--){
                ans.add(matrix[lastRow][i]);
            }
            lastRow--;
            if(ans.size()==t) break;
            for(int i=lastRow;i>=firstRow;i--){
                ans.add(matrix[i][firstCol]);
            }
            firstCol++;
            //if(firstRow<=lastRow && firstCol<=lastCol) break;
        }
        return ans;
    }
}
