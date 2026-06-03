// Problem Name : Squares of a Sorted Array
// Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}