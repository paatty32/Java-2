import java.util.ArrayList;

public class Student extends Person{

    private int matrikelnummer;
    private ArrayList<Pruefung> pruefungen;

    public Student(String name, int alter, int matrikelnummer){
        super(name, alter);
        this.matrikelnummer = matrikelnummer;
    }

    public void berechneDurschnittsNote(){
        double durschnitt = 0.0;

        for(int i = 0; i < pruefungen.size(); i++){
            if(pruefungen.get(i).istBestanden()) {
                durschnitt += pruefungen.get(i).getNote();
            } else{
                durschnitt = 5.0;
                break;
            }
        }

        if(durschnitt != 5.0) {
            durschnitt = durschnitt / pruefungen.size();
        }

        System.out.println("Die Durschnittsnote beträgt: " + durschnitt);
    }

    public int getMatrikelnummer(){
        return this.matrikelnummer;
    }

    public void printAllePruefungen(){
        for(int i = 0; i < pruefungen.size(); i++){
            System.out.println(pruefungen.get(i).toString() );
        }
    }




}
