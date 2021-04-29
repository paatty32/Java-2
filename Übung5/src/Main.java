import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Übt den Umgang mit Collections in Java.
 */
public class Main {

    public static void main(String args[]){
        /*Aufgabe 1: Collections*/
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(123, "Patrick"));

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student(1234, "Patrick 2"));

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student(123, "Patrick"));

        /*
        Gibt true zurück, wenn die equals Methode Überschrieben wurde und richtig implementiert
        Contains aus der ArrayList nutzt die equals Methode aus Objects. Ist diese Methode nicht überschrieben,
        nutzt vergleicht die Contains Methode die Soeicheradressen und würde false zurück geben.
         */
        System.out.println("StudentArrayLIst: " + studentList.contains(new Student(123, "Patrick")));
        System.out.println("LinkedList: " + studentLinkedList.contains(new Student(123, "Patrick")));

        /*
        Die HashSet Collection überprüft beim einfügen, ob das Element schon erhalten ist in dem Sie erstmal die HashCode
        Methode Aufruft und diese mit dem Objekt vergleicht, das eingefügt werden soll. Falls diese gleich sein sollten
        wird dann mit der equals Methode verglichen, ob die Objekte gleich sind.
        --> add liefert true, wenn das Objekt noch nicht im HashSet vorhanden ist, sonst false
         */
        System.out.println("StudentHashSet: " + studentHashSet.add(new Student(1234, "Patrick")));
    }
}
