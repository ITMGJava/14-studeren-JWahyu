public class Student {
    private String naam;
    private int studentnummer;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(int studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String toString() {
        return (naam + " " + studentnummer);
    }

    public Student() {
    this.naam = naam;
    this.studentnummer = studentnummer;
    }

    public Student(String Naam, int Studentnummer) {
        naam = Naam;
        studentnummer = Studentnummer;
    }
}
