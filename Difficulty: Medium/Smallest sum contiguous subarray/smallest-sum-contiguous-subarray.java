class Solution {
    static int smallestSumSubarray(int arr[], int n) {
        int bestEnding = arr[0];
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            bestEnding = Math.min(arr[i], bestEnding + arr[i]);
            ans = Math.min(ans, bestEnding);
        }

        return ans;
    }
}