//Реализуйте метод, который запрашивает у пользователя ввод
//дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

// https://javarush.com/quests/lectures/questsyntaxpro.level02.lecture05
// Ввод с клавиатуры

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("homework_355091_Sem2  Task1");
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean needFloat = true;
        float aF = 0;
        int count = 0;
        String aS = "";


        while (needFloat && count < 5){ // only 5 attempts
            System.out.print(count + ". Введите дробное число :");
            count ++;

            if (scanner.hasNext()) {
                aS = scanner.next();
                try {
                    aF = Float.valueOf(aS);
                    needFloat = false;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное значение " + aS);
                }
            }
        }

        if (! needFloat) System.out.print(" Дробное число :" + aF);
        else  System.out.print(" НЕТ Дробного числа ....");
    }
}