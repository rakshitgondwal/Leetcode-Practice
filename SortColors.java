import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
     int [] nums = {2,0,2,1,1,0};
     sortColors(nums);
     System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int [] nums){
        mergeSort(nums,0, nums.length-1);
    }
    public static void mergeSort(int arr[], int left, int right)
    {
        int middle;
        if (left < right) {
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }
    public static void merge(int arr[], int left, int middle, int right)
    {
        int low = middle - left + 1;
        int high = right - middle;

        int L[] = new int[low];
        int R[] = new int[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++)
        {
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++)
        {
            R[j] = arr[middle + 1 + j];
        }


        int k = left;
        i = 0;
        j = 0;

        while (i < low && j < high)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < high)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
