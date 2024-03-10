package seminars.sem02.task03;

/*
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение).
Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
 */
public class Main {
    public static void main(String[] args) {
        String s ="А роза упала на лапу Азора";
        System.out.println(isPolindromeV1(s));
        System.out.println(isPolindromeV2(s));
    }

    static String fixString(String s){
        return s.toLowerCase().replace(" ", "");
    }

    static boolean isPolindromeV1(String s){
        s = fixString(s);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    static boolean isPolindromeV2(String s){
        s = fixString(s);
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(s);
    }
}



