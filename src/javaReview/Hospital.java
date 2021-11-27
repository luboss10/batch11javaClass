package javaReview;

public class Hospital {
    public static void main(String[] args) {

        Doctor doctor1=new Doctor("John","Vader","Dentist",200000); //
       // doctor1.name="John";
       // doctor1.lastName="Vader";
       // doctor1.speciality="Dentist";
       // Doctor.hospital="Lenox Hospital";
        //WE DON'T NEED THIS HERE BECAUSE WE HAVE A CONSTRUCTOR
        doctor1.printAllInfo();
        doctor1.getPaid();

        Doctor doctor2=new Doctor("Jane","Bond","Cardiologist",500000);
        //doctor2.name="Jane";
       // doctor2.lastName="Smith";
       // doctor2.speciality="Cardiologist";
       // Doctor.hospital="Lenox Hospital";
       // doctor2.work();
       // doctor2.lastName="Bond"; // last name can change bcuz its not static
        //doctor2.hospital="JW Hospital"; - change will effect all instannces bcuz its static
        System.out.println((doctor2.lastName));
        Doctor.companyName();


    }
}
