package interview;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;  // length of the input array
        System.out.println(n);
        
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        
        // Left products
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1]; // product of all elements to the left of i
        }
        
        // Right products
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        // Result = left * right
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        
        System.out.println(Arrays.toString(result));
    }
}
