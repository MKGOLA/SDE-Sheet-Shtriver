class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        int max=arr[0],res=arr[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(max+arr[i],arr[i]);
            res=Math.max(max,res);
        }
        return res;
    }
}
