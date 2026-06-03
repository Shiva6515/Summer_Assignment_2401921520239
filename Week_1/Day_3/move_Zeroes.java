// Problem Name : Move Zeroes
// Problem Link : https://leetcode.com/problems/move-zeroes/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}