package class18Inheritance;

public class cat extends Animal { //extends Animal

    void printAllInfo() {
        System.out.println(name + breed + color + age + weight);
    }
        void meow() {
            System.out.println(name + " meows");
        }
    }
