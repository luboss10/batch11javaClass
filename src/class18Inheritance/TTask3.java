package class18Inheritance;

public class TTask3 {
    //Write a Java program called Teacher.
    // Identify features and behaviour of that Class.
    //  Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    //  that would have it their own features and behaviour. Test all 4 classes
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Lubo";
        mathTeacher.teachMath();

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Miska";
        chemistryTeacher.teachChemistry();

        musicTeacher musicTeacher= new musicTeacher();
        musicTeacher.name = "Hanicka";
        musicTeacher.teachMusic();

    }
    }
    class Teacher {
        String name;

        void teach() {
            System.out.println(name+ "Teaches diff subjects");
        }

    }

    class MathTeacher extends Teacher {
        void teachMath() {
            System.out.println(name + " Teaches math");
        }
    }

    class ChemistryTeacher extends Teacher {
        void teachChemistry() {
            System.out.println(name + " Teaches chemistry");
        }
    }

    class musicTeacher extends Teacher {
        void teachMusic() {
            System.out.println(name + " Teaches music");
        }
    }


