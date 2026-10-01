package ArrayProgramming;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        // convert kth largest to index of kth smallest
        k = n - k;
        return quickSelect(nums, 0, n - 1, k);
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {

        int pivot = nums[right];
        int p = left;

        // partition
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                swap(nums, p, i);
                p++;
            }
        }
        swap(nums, p, right);

        // recursion logic
        if (p > k) {
            return quickSelect(nums, left, p - 1, k);
        } else if (p < k) {
            return quickSelect(nums, p + 1, right, k);
        } else {
            return nums[p];
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(findKthLargest(nums, k)); // Output: 5
    }
}
