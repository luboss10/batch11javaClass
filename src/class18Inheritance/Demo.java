package class18Inheritance;

public class Demo {

/*
         1. constructor is a special block of code that help us build/construct (giving initial values to the fields) of the object
         2. when we write a new className() this is the code that executes the constructor for the class
         3. when we do not write a constructor a default constructor is provided by java compiler
         4. if there are multiple constructors in a class , java will check the number of parameters,type of parameters and sequence of parameters
         5. rules:
         Constructors have same name as the class name
         Constructors dont have return types, not even void
         we can use "this" keyword with parentheses to invoke the other constructors if the same class
         this:
         this can be used to differentite local and instance variables
        */

        public Demo () {
            System.out.println("1");
        }
        public Demo(String name, int age){
            System.out.println("2");
        }
         public Demo(String name, int age, double weight){
            System.out.println("3");

        }
    }
