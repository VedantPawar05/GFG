class Solution {
    public int findFloor(int[] arr, int x) {
        
        int n = arr.length;
        int left = 0, right = n - 1;
        int idx = -1;
        
        while (left <= right) {
            
            int mid = (left + right) / 2;
            
            if (arr[mid] <= x) {
                idx = mid;      
                left = mid + 1; 
            } 
            else {
                right = mid - 1;
            }
        }
        
        return idx;
    }
}