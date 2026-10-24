public class QuickSort {

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int partition(int[] arr, int low, int high) {
        int start = low + 1;
        int end = high;
        int pivot = arr[low];
        int temp;
        do {

            while (start <= high && arr[start] <= pivot) {
                start++;
            }
            while (end > low && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

        } while (start < end);

        temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        return end;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 5, 2 };
        System.out.println("The array before sorting:");
        printArr(arr);
        System.out.println("The array after sorting:");
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}