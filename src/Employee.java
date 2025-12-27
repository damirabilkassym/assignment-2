public class Employee extends Human implements IWork, IStudy {
    private final String position;
    private final float salary;
    public static int employeeCount = 0;

    public Employee(int age, String name, boolean isMale, String position, float salary) {
        super(age, name, isMale);
        this.position = position;
        this.salary = salary;
        employeeCount++;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String getRole() {
        return "Employee";
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + position);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }

    @Override
    public void study() {
        System.out.println(name + " is improving professional skills");
    }

    @Override
    public double getProgress() {
        return 100;
    }
}
