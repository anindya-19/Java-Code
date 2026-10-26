public class MergeSort {

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            arr[low + m] = temp[m];
        }

    }

    static void divide(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 5, 2 };
        System.out.println("The array before sorting:");
        printArr(arr);
        System.out.println("The array after sorting:");
        divide(arr, 0, arr.length - 1);
        printArr(arr);
    }
}