class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i = m-1;
         int j = n-1;
         int k = (m+n)-1;
        
        // if(i==0 && j==1)
        //     nums1[k] = nums2[j]; 
            
            
        while(i >= 0 && j >= 0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else
            {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        
        while(j >= 0)
        {
            nums1[k] = nums2[j];
                j--;
                k--;
        }
    }
}