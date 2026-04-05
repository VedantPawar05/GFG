class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        
        Arrays.sort(arr);
        
        long ans = 0;
        
        for(int i = 0; i < n - 2; i++) {
            
            int left = i + 1;
            int right = n - 1;
            
            while(left < right) {
                
                long currentSum = arr[i] + arr[left] + arr[right];
                
                if(currentSum < sum) {
                    ans = ans + (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return ans;
    }
}