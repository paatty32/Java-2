import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        Student patrick = new Student("Patrick", 26, 1234456);
        Student lissa = new Student("Lissa", 27, 234456);

        Dozent nitsche = new Dozent("Nitsche");

        ArrayList<Person> studentenVerwaltung = new ArrayList<>();

        studentenVerwaltung.add(patrick);
        studentenVerwaltung.add(lissa);
        studentenVerwaltung.add(nitsche);

        for(int i = 0; i < studentenVerwaltung.size(); i++){
            System.out.println(studentenVerwaltung.get(i).getName());
        }

    }

}
