class Solution {
    int countFreq(int[] arr, int target) {

        int n = arr.length;
        int first = -1;
        int last = -1;

        // Find first occurrence
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (first == -1) {
            return 0;
        }

        // Find last occurrence
        start = 0;
        end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return last - first + 1;
    }
}