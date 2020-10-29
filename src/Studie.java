import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Studie {
    Scanner invoer = new Scanner(System.in);
    private String naam = "Culturele Antropologie";
    public Student[] studenten = new Student[10];
    private String[] vakken = {"onderzoeksmethoden", "religie", "burgerschap", "globalisatie"};


    // Gets-Sets
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

//    public Student[] getStudenten(String Naam, int Studentnummer) {
//        return studenten;
//    }
//
//    public void setStudenten(Student[] studenten) {
//        this.studenten = studenten;
//    }

    public String[] getVakken() {
        return vakken;
    }

//    public String toString() {
//
//    }

    public void setVakken(String[] vakken) {
        this.vakken = vakken;
    }
    // Einde Gets-Sets

    void vakken() {
        System.out.println(Arrays.toString(vakken).toUpperCase().replaceAll("\\[|\\]", ""));
    }


    Student zoekStudent(int studentnr) {
        List<Student> studentenList = Arrays.asList(studenten);
        int searchIndex = 0;
        System.out.print("Zoek student op aan de hand van studentennummer. Graag enkel cijfers invullen: ");
        boolean check = false;
        while (!check) {
            try {
                studentnr = Integer.parseInt(invoer.nextLine());

                searchIndex = Collections.binarySearch(studentenList, studentnr);

//                if (searchIndex != 0) {
                    System.out.println(studenten[searchIndex]);
                    check = true;
//                }
//                else {
//                    System.out.println("Niet gevonden. Zoek student op aan de hand van studentennummer. Graag enkel cijfers invullen: ");
//                    check = false;
//                }

            } catch (NumberFormatException e) {
                System.out.print("Geen geldige invoer. Zoek student op aan de hand van studentennummer. Graag enkel cijfers invullen: ");
                check = false;
            }
        }
        return studenten[searchIndex];

    }




    // Constructors
    public Studie() {
        this.naam = naam;
        this.studenten = studenten;
        this.vakken = vakken;

    }

    public Studie(Student[] studenten) {
        this.studenten = new Student[10];
    }
    // Einde Constructors

    public static void main(String[] args) {
        // Leeg
    }

}
