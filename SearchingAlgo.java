public class SearchingAlgo {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 3;

        int binarySearchReturn = binarySearch(arr, target);

        if (binarySearchReturn != -1) {
            System.out.println("Element found at index:" + binarySearchReturn);

        } else {
            System.out.println("Element not found!");
        }

        int linearSeachReturn = linearSearch(arr, target);
        if (linearSeachReturn != -1)
            System.out.println("Element found at index:" + linearSeachReturn);
        else
            System.out.println("element not found!!");
    }
}