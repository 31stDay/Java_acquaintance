package seminars.sem01.task03;

import java.util.Arrays;

/*
Дан массив nums = [3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,5,3};
        int number = 3;
        System.out.println(Arrays.toString(getArray(arr, number)));
    }
    static int[] getArray(int[] arr, int number){
        int[] arr2 = new int[arr.length];
        Arrays.fill(arr2, number);
        for (int i = 0, j=0; i < arr.length; i++) {
            if(arr[i] != number){
                arr2[j++] = arr[i];
            }
        }
        return arr2;
    }
}
