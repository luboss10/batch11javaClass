package javaReview;
public class Doctor {
    public String name;
    public String lastName;
    public String speciality;
    public double salary;
     public  int ssn;
    public static String hospital= "NYU"; //static variable

    public Doctor(){

    }
    //constructor
    public Doctor(String name,String lastName,String speciality,double salary) {
        //constructor initializes the object , and have no return type
        //initialize instance variables
        // pass parameters in ()
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
        this.salary = salary; //if using this we need to pass the parameters into sub class ,into object()
    }
        public Doctor(String name,String lastName,String speciality ) {
            this.name=name;
            this.lastName=lastName;
            this.speciality=speciality;
        }

        //method
    public void printAllInfo() {
        System.out.println(name+" "+lastName+" "+speciality+" "+salary);
    }

    public void printInfo(){
        System.out.println(name+" "+ lastName+" is a "+speciality);
    }
    public void work(){ //static members can only with static, so this cannot be static in this example
        System.out.println(name+" works at hospital "+hospital);
    }
    public void getPaid(){
        System.out.println(name+" gets paid "+ salary);
    }
    public static void companyName() {
        System.out.println("All doctors work at "+ hospital);
    }

}

