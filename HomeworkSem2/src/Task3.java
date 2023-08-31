import java.io.FileNotFoundException; //add import  FileNotFoundException;
//  https://rollbar.com/blog/java-filenotfoundexception/

public class Task3 {

    public static void main(String[] args) throws Exception {

        System.out.println("homework_355091_Sem2  Task3");
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {  // set last catch "(Throwable ex)", not first....
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {  // no change remove   throws FileNotFoundException
        System.out.println(a + b);
    }
}
