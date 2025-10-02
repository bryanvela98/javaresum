package OOPInheritance16;

public class StudentInternational extends ChildClassStudent {
    // This class inherits from ChildClassStudent which in turn inherits from ParentClassPerson

    // Child class attributes
    private String country;
    private double gradeLanguage;

    // Getter and Setter methods
    public String getCountry() {
        return country;
    }

    public double getGradeLanguage() {
        return gradeLanguage;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGradeLanguage(double gradeLanguage) {
        this.gradeLanguage = gradeLanguage;
    }


}
