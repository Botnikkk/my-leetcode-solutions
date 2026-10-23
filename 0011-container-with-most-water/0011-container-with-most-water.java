class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int area = 0;

        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            area = (high - low) * Math.min(height[low], height[high]);
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }

            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}