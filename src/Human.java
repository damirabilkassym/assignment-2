public abstract class Human {
    int age;
    String name;
    boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public abstract String getRole();

    public void introduce() {
        System.out.println("My name is " + name + ", I am " + age + " years old.");
    }
}
