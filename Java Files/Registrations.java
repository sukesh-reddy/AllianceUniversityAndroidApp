package in.edu.alliance.alliance;

public class Registrations {

    String studentName;
    String studentRegNum;


    public Registrations(){

    }

    public Registrations(String studentName, String studentRegNum) {
        this.studentName = studentName;
        this.studentRegNum = studentRegNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentRegNum() {
        return studentRegNum;
    }
}