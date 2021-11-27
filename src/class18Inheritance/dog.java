package class18Inheritance;

public class dog extends Animal {//extends main class Animal..inherits

    boolean loyal=true;
    void printAllInfo(){
        System.out.println(name+breed+color+age+weight);
    }
    void bark (){
        System.out.println(name +" barks");
    }
}
