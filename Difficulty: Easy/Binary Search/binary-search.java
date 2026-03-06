class Solution {
    public int binarysearch(int[] arr, int tar) {
        int  idx= -1;
        int low=0,high=arr.length -1;
        
       while(low<=high){
           
           int mid = (low+high)/2;
           
           if(arr[mid]>tar) high = mid - 1;
             else if(arr[mid]<tar) low  = mid + 1;
             else{
                 //arr[mid]== target
                 idx = mid;
                 high = mid - 1;
                 
             }
          
       }
         return idx;
        
    }
}