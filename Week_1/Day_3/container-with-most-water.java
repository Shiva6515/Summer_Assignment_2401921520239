// Problem Name : Container With Most Water
// Problem Link : https://leetcode.com/problems/container-with-most-water/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public int maxArea(int[] height) {
        int i = 0,n = height.length;
        int j = n-1;
        int h = 0;
        int maxArea = 0;
        while(i<j){
            h = Math.min(height[i],height[j]);
            maxArea = Math.max(maxArea,h*(j-i));
            n--;
            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}