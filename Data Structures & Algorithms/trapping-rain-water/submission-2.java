class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(height == null || n == 0) return 0;

        int l = 0; int r = n - 1;
        int leftMax = height[l]; int rightMax = height[r];

        int result = 0;

        while(l < r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                result += leftMax - height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                result += rightMax - height[r];
            }
        }
        return result;
    }
}
