/**
 * bubblesort
 */
public class mergesort {

    public static void main(String[] args) {

        int[] arr = { 38, 27, 43, 3, 9, 81, 10 };

        int[] ans = mergeSort(arr, 0, arr.length - 1);

        display(ans);

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static int[] merge(int[] one, int[] two) {

        int[] sorted = new int[one.length + two.length];

        int i = 0, j = 0, k = 0;

        while (i < one.length && j < two.length) {

            if (one[i] < two[j]) {
                sorted[k] = one[i];
                k++;
                i++;
            } else {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if (i == one.length) {
            while (j < two.length) {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if (j == two.length) {

            while (i < one.length) {
                sorted[k] = one[i];
                k++;
                i++;
            }
        }
        return sorted;
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {

        if (lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo + hi) / 2;

        int[] firsthalf = mergeSort(arr, lo, mid);
        int[] secondhalf = mergeSort(arr, mid + 1, hi);

        int[] sorted = merge(firsthalf, secondhalf);
        return sorted;

    }

}