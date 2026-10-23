class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int area = 0;

        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            if (height[low] < height[high]) {
                 area = (high - low) * height[low];
                low++;
            } else {
                 area = (high - low) * height[high];
                high--;
            }

            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}