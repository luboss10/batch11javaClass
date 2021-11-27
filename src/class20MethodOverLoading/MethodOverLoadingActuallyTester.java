package class20MethodOverLoading;

public class MethodOverLoadingActuallyTester {
    public static void main(String[] args) {
        MethodOverLOadingActually.add(10,10,10);
        //MethodOverLOadingActually.add(20000,211);
        //int [] arr={21111.4,1111.65,89,4321,87.6};
        MethodOverLOadingActually.add(1111,1223,345455,77777,999);
        MethodOverLOadingActually.add(32.3,21.6);
        MethodOverLOadingActually.add(22,11,44,54,51);
    }
}//VAR ARG-
   // static void add(int... arr) { //this can take care of all parameters and arrays
   //     int sum = 0;
  //      for (int number : arr) {
  //          sum = number + sum;
  //      }
  //     System.out.println(sum);
 //   }
// WE CAN USE THIS IN EVERY EXAMPLE INSTEAD OF WRITING EVERYTHING OUT