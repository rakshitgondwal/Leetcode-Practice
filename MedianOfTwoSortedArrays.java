public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int [] nums1= {1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int [] nums1, int [] nums2){
        int [] a = new int[nums1.length+ nums2.length];
        int i=0; int j =0;int k = 0;
        while (i< nums1.length&&j<nums2.length){
            if (nums1[i] < nums2[j]){
                a[k] = nums1[i];
                i++;
                k++;
            }else{
                a[k] = nums2[j];
                j++;
                k++;
            };
        }
        while (i< nums1.length){
            a[k] = nums1[i];
            i++;
            k++;
        }
        while (j< nums2.length){
            a[k] = nums2[j];
            j++;
            k++;
        }

        if (a.length%2 != 0){
            return a[a.length/2];
        }else {
            double l = a[a.length/2 -1];
            double r = a[a.length/2];
            double q = (l+r)/2;
            return q;
        }
    }
}
