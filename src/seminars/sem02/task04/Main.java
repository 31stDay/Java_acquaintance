package seminars.sem02.task04;

/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
и метод, который запишет эту строку в простой текстовый файл,
обработайте исключения.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {

    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String s = "test";
        int n = 8;
        String filePath = "src/lesson2/seminar/test.txt";
        String logPath = "src/lesson2/seminar/log.txt";

        createLogger(logPath);

        String res = repeat(s, n);
        writeInFile(res, filePath);
        System.out.println(readFile(filePath));

        closeLogger();
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static void createLogger(String logPath){
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            Formatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeInFile(String s, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(s);
            writer.write("\n");
            logger.info("Запись прошла успешно");
        } catch (IOException e){
            e.printStackTrace();
            logger.warning("Не удалось записать в файл");
        }
    }

    static String readFile(String filePath){
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static String repeat(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}

