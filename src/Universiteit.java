import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Universiteit {
    public static void main(String[] args) {
        Studie st = new Studie();
        Student s1 = new Student("Alex Zhao", 89789);
        Student s2 = new Student("Peter Roest", 72642);

        st.studenten[1] = s1;
        st.studenten[2] = s2;

        int i = 0;
        for (Student student : st.studenten) {

            if (st.studenten[i++] != null) {
                System.out.println(student);
            }
        }

        st.vakken();




        st.zoekStudent(0);

    }
}
