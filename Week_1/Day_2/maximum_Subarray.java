// Problem Name : Maximum Subarray
// Problem Link : https://leetcode.com/problems/maximum-subarray/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            maxSum = Math.max(nums[i],nums[i]+maxSum);
            ans = Math.max(ans,maxSum);
        }
        return ans;
    }
}