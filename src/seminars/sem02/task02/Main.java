package seminars.sem02.task02;

/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */
public class Main {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        System.out.println(compression(s));
    }

    static String compression(String s){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
            } else {
                stringBuilder.append(s.charAt(i-1));
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(s.charAt(s.length()-1));
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}

