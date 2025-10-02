package OOPInheritance16;

public class ParentClassPerson {
    // Setting some attributes
    private String name;
    private String lastname;
    private int age;
    private String email;
    // Recomendation is that parent attributes should be private as possiblely
    // because child class can access them using getter and setter methods

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
