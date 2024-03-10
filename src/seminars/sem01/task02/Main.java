package seminars.sem01.task02;

/*
Дан массив двоичных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int a = getCount(arr);
        System.out.println(a);
    }

    static int getCount(int[] arr){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
                if (maxCount < count){
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}