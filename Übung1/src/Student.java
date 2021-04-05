import java.util.ArrayList;

public class Student extends Person{

    private int matrikelnummer;
    private ArrayList<Pruefung> pruefungen;

    public Student(String name, int alter, int matrikelnummer){
        super(name, alter);
        this.matrikelnummer = matrikelnummer;
    }


}
