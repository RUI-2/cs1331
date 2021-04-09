public class Student {

    private String name;
    private String major;
    private int year;
    public Student(String name, String major, int myYear) {
        this.name = name;
        major = major; 
        int  year = myYear;
    }
    public static void main(String[] args) {
    	Student s1 = new Student("Taylor", "CM", 12);
    }
}