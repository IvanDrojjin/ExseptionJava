//  Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

// https://javarush.com/quests/lectures/questsyntaxpro.level02.lecture05
// Ввод с клавиатуры

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("homework_355091_Sem2  Task4");
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean needString = true;
        String aS = "";

        System.out.print(" Введите Строку(!! не пустую) :");

        if (scanner.hasNextLine()) {
            aS = scanner.nextLine();
            if (aS != null && aS.length()>0){
                needString = false;
            }
        }

        if (! needString) System.out.print(" Строка :'" + aS +"'  " + aS.length());
        else  throw new Exception("Строка не введена");
    }

}