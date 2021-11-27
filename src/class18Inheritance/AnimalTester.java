package class18Inheritance;

public class AnimalTester {
    public static void main(String[] args) {

        dog dog=new dog();
        dog.name="Hugo";
        System.out.println(dog.name);
        dog.bark();
        dog.sleep();
        cat cat=new cat();
        System.out.println(cat.name);
        cat.name="Kitty";
        cat.meow();
        cat.eat();



    }
}
