class Solution {
    static int Search(int array[], int k) {
        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == k) 
                return mid;

            // left half sorted
            if (array[low] <= array[mid]) {
                if (array[low] <= k && k < array[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } 
            else { // right half sorted
                if (array[mid] < k && k <= array[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}