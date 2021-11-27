package class20MethodOverLoading;

public class MethodOverLOadingActually {
    //overloading with constructors is also possible
   // static void add(int num1, int num2) {
     //   System.out.println(num1 + num2);
  //  }

    static void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    static void add(int... arr) { //this can take care of all of the parameters and arrays
        int sum = 0;
        for (int number : arr) {
            sum = number + sum;
        }
        System.out.println(sum);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2); //this is also overloading method
    }
}


