
public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA;   // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // call Person constructor
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters
    public String getIdNum() { return myIdNum; }
    public double getGPA() { return myGPA; }

    // Setters
    public void setIdNum(String idNum) { myIdNum = idNum; }
    public void setGPA(double gpa) { myGPA = gpa; }

    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}