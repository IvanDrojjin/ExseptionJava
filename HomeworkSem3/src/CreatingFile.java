// package HW.hw3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatingFile {
    public static void creatingFile(String text, String name) {
        boolean indicatorFile = false;   //  Files.exists name.txt
        String str;
        if (Files.exists(Path.of(name + ".txt"))) {
            str = readFile(name);
            if (!str.contains(text)) {
                indicatorFile = true;
                writerFile(name, text, indicatorFile);
                System.out.print("Данные успешно добавлены\n :");
            } else {
                System.out.print("Данные существуют\n :");
            }
        } else {
            writerFile(name, text, indicatorFile);
            System.out.printf("Файл [%s.txt] успешно создан\n :", name);
        }
    }

    public static String readFile(String name) {
        try (FileReader reader = new FileReader(name + ".txt")) {
            int c;
            StringBuilder str = new StringBuilder();
            while ((c = reader.read()) != -1) {
                str.append((char) c);
            }
            return str.toString();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения файла \n" + e);
        }
    }

    public static void writerFile(String name, String text, boolean indicator) {  // boolean indicator  =  append
        String nameF = name + ".txt", s;
        try (FileWriter writer = new FileWriter(nameF, indicator)) {
            writer.write(text + "\n");
//            /****************************
//            При возникновении проблемы с чтением-записью в файл,
//            исключение должно быть корректно обработано, пользователь должен увидеть
//            стектрейс ошибки.
//            ****************************/
//            throw new IOException("test IO exception   dummy   ...");
        } catch (IOException e) {
            s = String.format("Ошибка записи файла [%s],\n %s", nameF, e);
            throw new RuntimeException(s);
        }
    }
}
