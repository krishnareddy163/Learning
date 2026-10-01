package ArrayProgramming;

public class MedianofTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i =0, j=0, k=0;
        int[] temparr = new int[n+m];
        while (i<n && j<m){
            if(nums1[i] < nums2[j]){
                temparr[k++] = nums1[i++];
            }
            else{
                temparr[k++] = nums2[j++];
            }

        }
        while(i< n){
            temparr[k++] = nums1[i++];
        }
        while(j<m) {
            temparr[k++] = nums2[j++];
        }
        int len = temparr.length;

        if (len % 2 == 0) {
            return (temparr[len / 2 - 1] + temparr[len / 2]) / 2.0;
        } else {
            return temparr[len / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 ={1,3,4,5,8};
        int[] nums2 ={2,6,7}; //1,2,3,4,5,6,7,8
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
