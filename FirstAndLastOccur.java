class FirstAndLastOccur {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);

        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, upperBound(nums, target) - 1};
    }

    public static int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
