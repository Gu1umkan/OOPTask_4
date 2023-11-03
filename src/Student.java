import java.time.LocalDate;

public class Student {
        String name;
        LocalDate dateOfBirth;
        int phoneNumber;
        String national;
        public Student(String name,LocalDate dateOfBirth,int phoneNumber,String national){
            this.name= name;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
            this.national = national;
        }
        public Student(){}
    }


