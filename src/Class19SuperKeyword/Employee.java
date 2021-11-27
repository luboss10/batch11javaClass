package Class19SuperKeyword;

public class Employee {
    //super keyword in java is a reference variables which is used to refer immediate parent class object

    String name;
    int age;
    int salary=30000;
    int baseNoDaysOff=20;

    void printSalary(){
        System.out.println(salary);
    }
    void printNodaysOff() {
        System.out.println(baseNoDaysOff);
    }
}

class Manager extends Employee{
    int salary=50000;
    int bonus=1000;
    int travelingAllowance=1000;
    void printSalary(){
        super.printSalary();
        System.out.println(bonus+travelingAllowance+super.salary);
    }
}
