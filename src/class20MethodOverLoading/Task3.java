package class20MethodOverLoading;

public class Task3 {
   // Create 1 class with a static method that has 3 overloaded forms.
    //Then call each overloaded method with specific arguments and observe result.

    static void method(boolean bol) {
        System.out.println(1);
    }
    static void method(String bol) {
        System.out.println(2);
    }
    static void method(double bol) {
        System.out.println(3);
    }
    static void method(String [] Strings) {
        System.out.println(100);
    }
    static void method(int num1, boolean bool) {
        System.out.println(4);
    }
    static void method(Task2 programming) {
        System.out.println("other class");
    }
}
