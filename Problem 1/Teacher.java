
public class Teacher extends Person {
    private String mySubject; // Subject taught
    private double mySalary;  // Annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getters
    public String getSubject() { return mySubject; }
    public double getSalary() { return mySalary; }

    // Setters
    public void setSubject(String subject) { mySubject = subject; }
    public void setSalary(double salary) { mySalary = salary; }

    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}