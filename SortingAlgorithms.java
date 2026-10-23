import java.util.*;
public class SortingAlgorithms{

    static void printArr(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int []arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void insertionSort(int []arr){

    }
    static void selectionSort(int []arr){

    }

    public static void main(String[] args) {
        int []original = {5,3,2,1,4};

        System.out.println("Before sorting!");
        printArr(original);
        bubbleSort(original);
        System.out.println("After sorting");
        printArr(original);
        // insertionSort(original.clone());
        // selectionSort(original.clone());
    }
}