package class18Inheritance;

public class Animal {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    void eat(){
        System.out.println(name+" eats");
    }
    void sleep() {
        System.out.println(name+ " sleeps");
    }
}
//inheritance in java is a mechanism in which one class acquires all the properties and behaviours/methods of parent class
//except PRIVATE members (fields/methods) and constructors
//you build upon existing classes that are similar
//we can reuse bt word EXTENDS, and inherit properties methods of a class
// inheritance represents IS a relationship.. (parent/child )
//ADVANTAGES =code re usability-takes less time,
// application performance-less memory,execution time is less

//disadvantages-using inheritance get tightly coupled
//if parent class is changed all the subclasses are dependent on it

//3 types of inheritance:
//1.single inheritance
//2.multilevel inheritance-inherits from sub class
//3.hierarchical inheritance
//4multiple inheritance- not used in java


