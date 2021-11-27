package class20MethodOverLoading;

public class Task3Tester {
    public static void main(String[] args) {
        Task3.method(false);
        Task3.method(300,false);
        Task2 programming=new Task2(); // calling a constructor from other class
        Task3.method(programming);

    }
}
