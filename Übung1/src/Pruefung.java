public class Pruefung {

    private String name;
    private String datum; //TODO: Richtiges Datum format suchen
    private double note;
    private String fach;
    private Dozent dozent;


    public Pruefung( String name, String datum, double note, String fach, Dozent dozent){
        this.name = name;
        this.datum = datum;
        this.note = note;
        this.fach = fach;
        this.dozent = dozent;
    }

    public double getNote(){
        return this.note;
    }

    public boolean istBestanden(){
        if(this.note > 4.0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "; Datum: " + this.datum + "; Note: " + this.note + "; Fach: " + this.fach +
                "; Dozent: " + this.dozent;
    }

}
