public class Student {

    private int matrikelnummer;
    private String name;

    final int SEED =23; //random Zahl
    final int ODD_PRIME_NUMBER = 37;

    public Student(int matrikelnummer, String name){

        this.matrikelnummer = matrikelnummer;
        this.name = name;

    }

     @Override
     public boolean equals(Object other){

        if(other instanceof Student){
            Student otherStudent = (Student) other;

            if(this.name == otherStudent.name && this.matrikelnummer == otherStudent.matrikelnummer){
                return true;
            } else return false;
        }
        return false;
     }

     @Override
    public int hashCode(){
        int hash = SEED;
        hash = ODD_PRIME_NUMBER * hash + this.name.hashCode();
        hash = ODD_PRIME_NUMBER * hash + this.matrikelnummer;

        return hash;
     }
}
