package day33exceptionsenumsiterator;

public class ExceptionRunner {
    /*
    Garbage Collector memory i temiz tutmak ıcın sureklı memoryi tarar ve slinmesi gerekenleri siler
    Garbage Collector silmeden once silecegi dataları finalize eder sonra siler
     */
    public static void main(String[] args) throws InvalidStudentGradeException {

        getStudentGrade(50);
        // getStudentGrade(-50); //InvalidStudentGradeException

        getTheNumberOfStudents(50);//50
        getTheNumberOfStudents(-50);//InvalidNumberException

    }

    public static void getTheNumberOfStudents(int numOfStudents) {
        if (numOfStudents < 0) {
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            } catch (InvalidNumberException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println(numOfStudents);
        }
    }

    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidStudentGradeException("Student's grade can not be less than zero or greater than 100");
        } else {
            System.out.println(grade);
        }
    }
}
