package Array;

import java.util.Arrays;

public class UserArray {


    public static void main(String[] args) {
        int[] array = {-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("add length+1 -->" + Arrays.toString(array = addlength(array)));
        array = addBegining(array, 12345);
        System.out.println(Arrays.toString(array));
    }

    public static int[] addlength(int[] arr) {
        return Arrays.copyOf(arr, arr.length + 1);
    }

    public static int[] addBegining(int[] arr, int value) {
         arr = addlength(arr);
        for (int i = arr.length - 2; i > -1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = value;
        return arr;
    }
}
