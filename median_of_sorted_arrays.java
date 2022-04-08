class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int l= nums1.length+nums2.length;
    int ans[]=new int[l];
    int x,j1=0,j2=0;
    if(l%2==0)
    {
    x=l/2;
    }
    else
    {
    x=l-1/2;
    }
    for(int i=0;i<l;i++)
    {
    if(i>x)
    {
    break;
    }
    if(j1==nums1.length)
    {
    ans[i]=nums2[j2];
    j2++;
    }
    else if(j2==nums2.length)
    {
    ans[i]=nums1[j1];
    j1++;
    }
    else
    {
    if(nums1[j1]<=nums2[j2])
    {
    ans[i]=nums1[j1];
    j1++;
    }
    else
    {
    ans[i]=nums2[j2];
    j2++;
    }
    }
    }
    if(l%2==0)
    {
    double o=((double)ans[l/2]+(double)ans[(l/2)-1])/2;
    return o;
    }
    return (double)ans[(l-1)/2];
    }
    }