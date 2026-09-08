import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,66};
        int left = 0;
        int right = arr.length - 1;
        int temp;
        System.out.println("The array before reversing: " + Arrays.toString(arr));
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("The array after reversing: " + Arrays.toString(arr));
    }
}
