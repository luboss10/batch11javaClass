package class20MethodOverLoading;

public class Task2 { //should be called Programming.


  //  Create a class named 'Programming'. While creating an object of the class,if nothing is passed to it,
   // then the message "I love programming languages" should be printed. If some String is passed to it,
  //  then in place of "programming languages" the value variable should be printed. Example, if we pass "Java",
   // then "I love Java" should be printed.

    Task2(){
        System.out.println("I love programming languages");
    }
    Task2(String value) {
        System.out.println("i love " + value);
    }
        public static void main(String[] args) {
            new Task2();
            new Task2("Java");
        }
    }


