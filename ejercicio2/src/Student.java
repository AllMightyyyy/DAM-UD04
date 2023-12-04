public class Student extends Person {
    private String studentID;
    public Student() {
        super();
        this.studentID = "0";
    }
    public Student(String firstName, String lastName, String NIF, String adress, String studentID) {
        super(firstName, lastName, NIF, adress);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", NIF='" + getNIF() + '\'' +
                ", adress='" + getAdress() + '\'' +
                "studentID='" + studentID + '\'' +
                '}';
    }
}
