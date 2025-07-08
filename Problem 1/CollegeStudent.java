
public class CollegeStudent extends Student {
    private String myMajor; // Major
    private int myYear;     // Year level (1=Frosh, 2=Soph, etc.)

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // Getters
    public int getYear() { return myYear; }
    public String getMajor() { return myMajor; }

    // Setters
    public void setYear(int year) { myYear = year; }
    public void setMajor(String major) { myMajor = major; }

    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}