public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int [] nums = {1,0,1,1,1};
        System.out.println(search(nums,0));
    }
    public static boolean search(int []arr, int target){
        int low = 0, high = arr.length - 1; //<---step 1

        while (low <= high) { //<--- step 2
            int mid = (low + high) >> 1; //<----step 3
            if (arr[mid] == target)
                return true; // <---step 4

            if (arr[low] <= arr[mid]) { //<---step 5
                if (arr[low] <= target && arr[mid] >= target)
                    high = mid - 1; //<---step 6
                else
                    low = mid + 1; //<---step 7
            } else { //<---step 7
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;

    }
}
