package class18Inheritance;

public class Task1 {

    //Write program for multilevel inheritance where class A inherited by
    //B and class B inherit class by C.
    public static void main(String[] args) {
        C b=new C();
    }
}
    class A {
         A() {
        System.out.println("A");
    }
}
    class B extends A {
         B() {
            System.out.println("B");
        }
    }
    class C extends B {
         C() {
        System.out.println("C");
    }
}