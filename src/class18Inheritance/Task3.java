package class18Inheritance;

public class Task3 {

    private Task3() {
        System.out.println("PRIVATE");
    }
    Task3(String name) {
        System.out.println("DEFAULT");
    }
    protected Task3(int age) {
        System.out.println("PROTECTED");
    }
    public Task3 (double weight) {
        System.out.println("PUBLIC");
    }
    public static void main (String[] args) {
        new Task3();             //NEW tASK3 NOT POSSIBLE AS IT IS PRIVATE CONSTRUCTOR
        new Task3("name");
        new Task3(10);
        new Task3(200);
    }

    //dont need a tester for this bcuxz of private const


}
