import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is male (true/false): ");
        boolean isMale = scanner.nextBoolean();

        System.out.print("Enter position: ");
        scanner.nextLine();
        String position = scanner.nextLine();

        System.out.print("Enter salary: ");
        float salary = scanner.nextFloat();

        Employee employee = new Employee(age, name, isMale, position, salary);
        Student student = new Student(18, "Damir", true, "Media Technologies", 2.99F);
        Human human = new Human(20, "Human", false);

        employee.introduce();
        System.out.println(employee.getRole());
        System.out.println(employee.getSalary());

        student.introduce();
        System.out.println(student.getRole());

        human.introduce();
        System.out.println(human.getRole());

        employee.setSalary(employee.getSalary() + 1);
        System.out.println("Updated salary: " + employee.getSalary());

        System.out.println("Total employees: " + Employee.employeeCount);
    }
}