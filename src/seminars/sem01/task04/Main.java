package seminars.sem01.task04;

/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */
public class Main {
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        String[] arr = line.split(" ");
        /*
        [Добро, пожаловать, на, курс, по, Java]
         */
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i];
            res += " ";
        }
        System.out.println(res.trim());
    }
}

