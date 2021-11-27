package javaReview;

public class community {
    public static void main(String[] args) {

        House House1=new House(); //refference varible
        House1.color="blue";
        House1.area=2000;
        House1.rooms=4;
        House1.clean();

        //House1.bathroom=2; -cannot be resolved


        House House2=new House();
        House2.color="white";
        House2.area=3000;
        House2.rooms=5;

    }
}
