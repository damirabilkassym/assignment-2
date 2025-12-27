public final class Student extends Human implements IStudy {
    private final String major;
    private final float gpa;
    public final String university;

    public Student(int age, String name, boolean isMale, String major, float gpa, String university) {
        super(age, name, isMale);
        this.major = major;
        this.gpa = gpa;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public void study() {
        System.out.println(name + " is studying " + major);
    }

    @Override
    public double getProgress() {
        return gpa * 25;
    }

    public void showUniversity() {
        System.out.println("University: " + university);
    }
}
