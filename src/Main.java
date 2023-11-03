import java.time.LocalDate;

import static java.lang.StringTemplate.STR;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gulumkan", LocalDate.of(2002, 4, 25), 703514182, "Kyrgyz");
        Student student2 = new Student("Aiturgan", LocalDate.of(2003, 4, 23), 703514183, "Kyrgyz");
        Student student3 = new Student("Zarina", LocalDate.of(2001, 4, 2), 703514192, "Kyrgyz");
        Student student4 = new Student("Kamila", LocalDate.of(2002, 4, 25), 703514112, "Kyrgyz");
        Student student5 = new Student("Alisa", LocalDate.of(2005, 12, 5), 703514188, "Kyrgyz");
        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student:students) {
            getInfo(student);
        }

    }
    public static void getInfo(Student student){
        System.out.println(STR."""
                Name :\{student.name}
                Date of Birth: \{student.dateOfBirth}
                Phone Number: \{student.phoneNumber}
                Nationality: \{student.national}
                """);
    }
}
