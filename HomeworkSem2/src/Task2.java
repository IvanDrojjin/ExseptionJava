// Если необходимо, исправьте данный код (задание 2)
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {0,1,2,3,4,5,6,7,8,9}; // add init data

        System.out.println("homework_355091_Sem2  Task2");
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            // change [8] to [???]
            // change 8 to 10.. 10+n   results   "out of bounds exception"
            // change 8 to 0..9    results   "ArithmeticException: / by zero"
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e){   // add catch
            System.out.println("Catching out of bounds exception: " + e);
        }
    }
}
