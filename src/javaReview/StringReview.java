package javaReview;

public class StringReview {
    public static void main(String[] args) {

        String str="Today is thursday and we have a Java review class";
        boolean empty=str.isEmpty();
        System.out.println("My string is empty= "+empty);

        //str.full(); is undeffined for the type String
        int length=str.length();
        System.out.println("Length of my string is "+length);

        //instead thursday i want to have monday
        str=str.replace("thursday","monday"); //reassign str with str or create another String day=str.replace
        System.out.println(str);

        //how many words does my string have
        String[] allWords=str.split(" ");
        System.out.println("My string has "+allWords.length+ " words");
        //pring all words 1 by 1
        for (String word:allWords) {
            System.out.print(word+",");
        }

        //how would you reverse a string
        String give="Hello";

        StringBuilder sb=new StringBuilder(give);     //constructor
        sb.reverse();
        System.out.println(sb);

        //how would you reverse a string without using reverse
        String reverse="";

        for (int i=give.length()-1;i>=0;i--) {
            reverse+=give.charAt(i);
        }
        System.out.println(reverse);
        //substring
        String s="Today im happy";
        s=s.substring(6);
        System.out.println(s);

        s=s.substring(6,10);
        System.out.println(s);



    }
}
