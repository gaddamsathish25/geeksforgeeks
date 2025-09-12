class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        for(int i=0;i<n;i++){
            int ans=(int)Math.pow(2,i);
            if(ans==n){
                return true;
            }
        }
        return false;
    }
}