package OOPInheritance16;

public class ExampleClassUse {
    public static void main(String[] args) {
        ChildClassStudent student1 = new ChildClassStudent();
        student1.setName("Bryan");
        student1.setAge(23);
        student1.setGradeHistory(4.5);
        student1.setGradeMath(4.8);

        StudentInternational student2 = new StudentInternational();
        student2.setName("John");
        student2.setAge(30);
        student2.setCountry("USA");
        student2.setGradeLanguage(4.6);

        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
        System.out.println("Student Grade History: " + student1.getGradeHistory());
        System.out.println("Student Grade Math: " + student1.getGradeMath());

        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Age: " + student2.getAge());
        System.out.println("Student Country: " + student2.getCountry());
        System.out.println("Student Grade Language: " + student2.getGradeLanguage());

        // This is the way to check the inheritance chain using reflection
        Class class1 = student2.getClass();
        while (class1.getSuperclass() != null) {
            String child = class1.getName();
            String parent = class1.getSuperclass().getName();
            System.out.println(child + " is a child class of " + parent);
            class1 = class1.getSuperclass();
        }
    }
}
