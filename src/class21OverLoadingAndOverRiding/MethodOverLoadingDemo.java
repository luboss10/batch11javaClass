package class21OverLoadingAndOverRiding;

public class MethodOverLoadingDemo {

    void method(int number){
        System.out.println(number);
    }
     void method (String name,int num) { //access modifiers don't play any role in method overloading like public ,private, static, or return type int,
        System.out.println(name);
        System.out.println("HELLO");

    }//method names should be same

    public static void main(String[] args) {
        MethodOverLoadingDemo md=new MethodOverLoadingDemo();
        md.method("ten",10);
    }
}
