package homework.hw01.task02;
/*
Напишите функцию printPrimeNums, которая выведет на экран все простые числа
в промежутке от 1 до 1000, каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.
 */
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        System.out.println(1);
        System.lineSeparator();
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println(i);
                System.lineSeparator();
            }
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}