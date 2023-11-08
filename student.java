

public class Student {

    private String name, major, year, graduationDate, email, studentID;
    private boolean transferStudent, funded;
    private int unitsEnrolled;

    // constructor
    public Student(String name, String studentID, String email) {
        this.name = name;
        this.studentID = studentID;
        this.email = email;
    }

    // all getters and setters required for both the Scholarship class and the Student class
    // BOILERPLATE BEGINS - this is why i hate java
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String newMajor) {
        major = newMajor;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String newYear) {
        year = newYear;
    }

    public String getGraduationDate() {
        return graduationDate;
    }
    public void setGraduationDate(String newGraduationDate) {
        graduationDate = newGraduationDate;
    }

    public String getEamil() {
        return email;
    }
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String newStudentID) {
        studentID = newStudentID;
    }

    public int getUnitsEnrolled() {
        return unitsEnrolled;
    }
    public void setUnitsEnrolled(int newUnitsEnrolled) {
        unitsEnrolled = newUnitsEnrolled;
    }

    public boolean isTransferStudent() {
        return transferStudent;
    }
    public void setIsTransferStudent(boolean isTransferStudent) {
        transferStudent = isTransferStudent;
    }

    public boolean isFunded() {
        return funded;
    }
    public void setIsFunded(boolean isFunded) {
        funded = isFunded;
    }
    // END BOILERPLATE


}