public class NextImmediateSmallest {
    public static void immediateSmaller(int[] a){
        int n = a.length;
        if (n < 2) {
            // If the array has fewer than two elements, return -1 for the only element
            a[0] = -1;
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < a[i + 1]) {
                    a[i] = -1;
                } else {
                    a[i] = a[i + 1];
                }
            }
            // Last element doesn't have any element on its right
            a[n - 1] = -1;
        }
    }
}
