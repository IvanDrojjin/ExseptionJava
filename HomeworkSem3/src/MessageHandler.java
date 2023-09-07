// package HW.hw3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;

public class MessageHandler {
    static int count6 = 6;
    static final String fioMatch = "[а-яА-Яa-zA-Z]+";
    static final String dateMatch = "dd.MM.yyyy";  // dummy
//    static final String phoneMatch = "[0-9]+";  // dummy
//    static final String sexMatch = "[fFmM]";  // dummy

    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
    // https://javascopes.com/java-count-chars-4daa4b2e/

//    public static boolean checkDataStr(String s){ //  check five " " in string  userData.length == 6
////   https://translated.turbopages.org/proxy_u/en-ru.ru.56e75114-64f99a5b-f23fc36f-74722d776562/https/stackoverflow.com/questions/5098429/java-count-number-of-symbols-in-string
//        long countZ = s.chars().filter(ch -> ch == ' ').count();
//        System.out.printf("checkDataStr(%s) : %s \n", s, countZ);
//
//        if (countZ  == count6 - 1)  return true;
//        else return false;
//    }

    public static void arrayEnteredData(String[] userData) {
        int count = 0;
        StringBuilder errorS =  new StringBuilder();
        String error ;

        if (userData.length != count6) {
            error = String.format("Вы ввели больше или меньше данных чем требуется [%s], введите строку заново", userData.length);
            errorS.append(error);
            // System.out.println(error);
            count++;
        } else {
            if (!userData[0].matches(fioMatch)) {
                error = String.format("Неверно введена фамилия [%s], введите строку заново \n", userData[0]);
                errorS.append(error);
                // System.out.println(error);
                count++;
            }
            if (!userData[1].matches(fioMatch)) {
                error = String.format("Неверно введено имя [%s], введите строку заново \n", userData[1]);
                errorS.append(error);
                // System.out.println(error);
                count++;
            }
            if (!userData[2].matches(fioMatch)) {
                error = String.format("Неверно введена отчество [%s], введите строку заново \n", userData[2]);
                errorS.append(error);
                // System.out.println(error);
                count++;
            }
            DateFormat df = new SimpleDateFormat(dateMatch);
            try {
                df.parse(userData[3]);
            } catch (ParseException e) {
                error = String.format("Неверный формат даты [%s], введите строку заново\n", userData[3]);
                errorS.append(error);
                // System.out.println(error);
                count++;
            }
            try {
                Long.parseLong(userData[4]);
            } catch (NumberFormatException e) {
                error = String.format("Неверный формат телефона [%s], введите строку заново\n", userData[4]);
                errorS.append(error);
                // System.out.println(error);
                count++;
            }
            if (!userData[5].equalsIgnoreCase("f") && !userData[5].equalsIgnoreCase("m")) {
                error = String.format("Неверно введен пол [%s], введите строку заново \n", userData[5]);
                errorS.append(error);
                // System.out.println(error);
                count++;
            }
        }

        if (count == 0) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < userData.length; i++) {
                if (i == userData.length - 1) {
                    text.append(userData[i]);
                } else {
                    text.append(userData[i]).append(" "); // add separate " "
                }
            }
            CreatingFile.creatingFile(text.toString(), userData[0]);
        } else{
            System.out.println(errorS);
            System.out.print(" Или введите exit для выхода :");

        }
    }
}
