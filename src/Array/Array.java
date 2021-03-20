package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int arr[] = new int[c];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 500);
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + "|");
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + "|");
            }
            sum += arr[i];
        }
        System.out.println();
        System.out.println("максимальное значение= " + arr[arr.length - 1]);
        System.out.println("минимальное значение = " + arr[0]);
        System.out.println("сумма всех элементов=" + sum);
        System.out.println("среднее арефметическое=" + sum / arr.length);
    }


}
