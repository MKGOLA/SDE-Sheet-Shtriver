class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        if(n==0||n==1) return;
        int l=-1,h=-1;
        for(int i=n-2;i>=0;i--)
            if(arr[i]<arr[i+1])
            {
                l=i;break;
            }
        for(int i=n-1;i>=0;i--)
            if(l!=-1&&arr[i]>arr[l])
            {
                h=i;break;
            }
        if(l!=-1&&h!=-1)
        {
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            revers(arr,l+1,n-1);
        }
        else
            revers(arr,0,n-1);
    }
    void revers(int arr[],int l,int h)
    {
        while(l<h)
        {
            int t=arr[l];
            arr[l]=arr[h];
            arr[h]=t;
            l++;h--;
        }
    }
}
