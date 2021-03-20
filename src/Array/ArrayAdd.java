package Array;

import java.util.Arrays;

public class ArrayAdd {

    public static void main(String[] args) {
        int[] array={0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(subArray(array,7,9)));

    }
    public static int[] subArray(int[] array, int index, int count){

        int[] newAray=Arrays.copyOfRange(array, index, index + count);
        int c=(newAray.length-1)-(index+count -array.length);
        while (c++<newAray.length-1) {
            newAray[c]=1;
        }
        return  newAray;
    }
}
