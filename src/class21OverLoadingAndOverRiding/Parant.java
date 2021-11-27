package class21OverLoadingAndOverRiding;

public class Parant {

    void method(int num){
        System.out.println("From parent");

    }
}
class Child extends Parant{
@Override
    void method (int num) {
        System.out.println("from child");
    }
    void method(String num) {
        System.out.println("from childdddddd");
    }

}
class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.method(10);


    }
}