// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               int temp=0;
               if(arr[j]<arr[i]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
      int ans =arr[k-1];
      
      return ans;
    }
}
