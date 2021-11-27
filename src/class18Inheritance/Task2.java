package class18Inheritance;

public class Task2 {
    //Write program to inherit class D that has
           // method printF which is static and call or reuse that method into class E

    public static void main(String[] args) {
        E.printF();

    }
}
class D{
   static void printF(){
        System.out.println("printF from A");
    }
}
class E extends D{

}