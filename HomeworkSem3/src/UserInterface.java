// package HW.hw3;

import java.util.Scanner;
import java.lang.String;

public class UserInterface {
    public static void dataEntry() {
        Scanner in = new Scanner(System.in);
        String bigHello =
                // """
                // Text Block
                // """;
"""
Введите данные пользователя через пробел  в формате:
Фамилия Имя Отчество дата_рождения номер_телефона пол
\t дата_рождения - строка формата dd.MM.yyyy
\t номер_телефона - в формате 79999999999
\t пол - символ латиницей f(женский) или m(мужской)
\t Или введите exit для выхода \n :""";

        System.out.print(bigHello);

        while (true) {
            String[] arr = in.nextLine().strip().split(" "); // .strip()
            if (arr[0].equalsIgnoreCase("exit")) {
                System.out.print(" До свидания ...");
                break;
            }
            MessageHandler.arrayEnteredData(arr);
        }
    }
}
