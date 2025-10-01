
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int[] p_small = new int[n];
        int[] n_small = new int[n];

        // for previous samllest
        for (int i = 0; i < n; i++) {
            while (s.size() > 0 && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                p_small[i] = -1;
            } else {
                p_small[i] = s.peek();
            }
            s.push(i);
        }

        s.clear();

        // for next smallest
        for (int i = n - 1; i >= 0; i--) {
            while (s.size() > 0 && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                n_small[i] = n;
            } else {
                n_small[i] = s.peek();
            }
            s.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = n_small[i] - p_small[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
