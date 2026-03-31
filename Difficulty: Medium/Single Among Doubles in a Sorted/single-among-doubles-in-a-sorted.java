class Solution {
    int single(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            int mid = i + (j - i) / 2;

            // make mid even
            if (mid % 2 == 1) mid--;

            // check pair
            if (arr[mid] == arr[mid + 1]) {
                i = mid + 2;   // go right
            } else {
                j = mid;       // go left
            }
        }

        return arr[i];
    }
}