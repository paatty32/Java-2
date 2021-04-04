public class Student extends Person{

    private int matrikelnummer;

    public Student(int alter, String name, int matrikelnummer){
        super(name, alter);
        this.matrikelnummer = matrikelnummer;
    }


}
