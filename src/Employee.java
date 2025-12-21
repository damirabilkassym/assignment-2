public class Employee extends Human {
    String position;
    float salary;

    public static int employeeCount = 0;

    public Employee(int age, String name, boolean isMale, String position, float salary) {
        super(age, name, isMale);
        this.position = position;
        this.salary = salary;
        employeeCount++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return "Employee";
    }
}
