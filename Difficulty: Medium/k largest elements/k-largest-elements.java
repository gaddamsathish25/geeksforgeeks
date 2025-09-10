import java.util.*;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // // Your code here
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         int temp=0;
        //         if(arr[j]<arr[i]){
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        
        Arrays.sort(arr);
        
        
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=arr.length-1;i>=arr.length-k;i--){
            list.add(arr[i]);
        }
        return list;
        
    }
}
