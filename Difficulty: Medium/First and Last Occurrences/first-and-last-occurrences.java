class Solution {
    public ArrayList<Integer> find(int arr[], int x) {
        
        int n = arr.length;
        int first = -1;
        int last = -1;
        
        int left = 0, right = n - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(arr[mid] == x){
                first = mid;
                right = mid - 1;
            }
            else if(arr[mid] > x){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
        left = 0;
        right = n - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(arr[mid] == x){
                last = mid;
                left = mid + 1;
            }
            else if(arr[mid] > x){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        
        return ans;
    }
}