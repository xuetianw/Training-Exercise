package MS.JavaAlgorithms.Arra;

import java.util.Arrays;

public class MergeTwoSortedArray {
    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int[] newArray = new int[arr1.length + arr2.length];
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArray[k++] = arr1[i++];
            } else {
                newArray[k++] = arr2[j++];
            }
        }
        for ( ; i < arr1.length; i++) {
            newArray[k++] = arr1[i];
        }
        for ( ; j < arr2.length; j++) {
            newArray[k++] = arr2[j];
        };
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,5,12,15};
        int[] arr2 = {3,4,7,22};
        int[] returnedArr = merge(arr1, arr2);
        Arrays.stream(returnedArr).forEach(x -> System.out.println(x));
    }
}
