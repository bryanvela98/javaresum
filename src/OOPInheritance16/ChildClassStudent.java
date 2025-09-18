package OOPInheritance16;

public class ChildClassStudent extends ParentClassPerson {
    // Child class attributes
    private String studentId;
    private String school;
    private double gradeMath;
    private double gradeHistory;

    public String getName() {
        return super.getName();
    }

    // Getter and Setter methods
    public String getStudentId() {
        return studentId;
    }

    public String getSchool() {
        return school;
    }

    public double getGradeMath() {
        return gradeMath;
    }

    public double getGradeHistory() {
        return gradeHistory;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setGradeMath(double gradeMath) {
        this.gradeMath = gradeMath;
    }

    public void setGradeHistory(double gradeHistory) {
        this.gradeHistory = gradeHistory;
    }

}
