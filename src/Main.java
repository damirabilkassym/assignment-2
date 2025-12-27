public class Main {
    public static void main(String[] args) {

        Human h1 = new Employee(18, "Damir", true, "Engineer", 400000);
        Human h2 = new Student(19, "Aruzhan", false, "IT", 3.8f, "AITU");

        Employee e1 = new Employee(28, "Ali", true, "HR", 350000);
        Student s1 = new Student(20, "Dana", false, "Design", 3.4f, "SDU");

        IWork worker = new Employee(40, "Serik", true, "Professor", 600000);
        IStudy learner = new Student(18, "Amina", false, "Physics", 3.9f, "NU");

        h1.introduce();
        System.out.println(h1.getRole());

        h2.introduce();
        System.out.println(h2.getRole());

        e1.work();
        System.out.println(e1.calculateBonus());

        s1.study();
        System.out.println(s1.getProgress());
        s1.showUniversity();

        worker.work();
        System.out.println(worker.calculateBonus());

        learner.study();
        System.out.println(learner.getProgress());

        System.out.println(Employee.employeeCount);
    }
}
