package HomeworkSem1; // https://gb.ru/lessons/355090  !!! java 11.0.14
public class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
    //        System.out.println("OutOfBoundsException()");
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 3, 5};
        for (int i = 0; i < b.length; i++){
            b[i] += a[i];
        }
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        System.out.println(69 / 0);

    }

    public static void numberFormatException() {

        // Напишите свое решение ниже
        // https://rollbar.com/blog/java-numberformatexception/

    //       throw new NumberFormatException("test numberFormatException");
    /**************************
    !!! Java 11.0.14

    Note: Printer.java uses or overrides a deprecated API.
    Note: Recompile with -Xlint:deprecation for details.

    deprecate [ˈdeprɪkeɪt] глагол Спряжение
    deprecated / deprecated / deprecating / deprecates
    осуждать (disapprove)
    удерживать от использования (disapprove)


    //       Integer aIntegerObj = new Integer("-9.one");
    //      Integer myInt = new Integer(" 123  ");
    ***************************/

        Integer.parseInt(null);

        Integer.parseInt("");

        Integer.parseInt("Twenty 2");

        Integer.parseInt("12345678901");

        int i =  Integer.parseInt(null);
    }
}
