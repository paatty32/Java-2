import java.util.ArrayList;

public class StudentenVerwaltung {

    private ArrayList<Student> studenten;
    private ArrayList<Dozent> dozenten;

    public StudentenVerwaltung(){

    }

    public StudentenVerwaltung(ArrayList<Student> studenten, ArrayList<Dozent> dozenten){
        this.studenten = studenten;
        this.dozenten = dozenten;
    }


    public void getStudenten(){

        System.out.println("***STUDENTEN***");

        for(int i = 0; i < studenten.size(); i++){
            System.out.println("Namen: " + studenten.get(i).getName() + "; Matrikelnummer: " + studenten.get(i).getMatrikelnummer());
        }
    }

    public void getDozenten(){

        System.out.println("***DOZENTEN***");

        for(int i = 0; i < dozenten.size(); i++){
            System.out.println("Namen: " + dozenten.get(i).getName());
        }
    }

    public void getStudentenUndDozenten(){
        this.getDozenten();
        this.getStudenten();
    }

}
