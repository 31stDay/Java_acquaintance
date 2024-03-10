package seminars.sem01.task05;

/*
Реализовать функцию возведения числа а в степень b. a, b из Z(целые числа).
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(pow(3, 2));
        System.out.println(pow(2, -2));
        System.out.println(pow(3, 0));
        System.out.println(pow(0, 100));
        System.out.println(pow(1, 100));
    }

    static double pow(double num1, int num2) {
        double res = 1;
        if (num1 == 0 || num1 == 1) return num1;
        if (num2 < 0){
            num1 = 1 / num1;
            num2 = -num2;
        }
        for (int i = 0; i < num2; i++) {
            res *= num1;
        }
        return res;
    }
}

