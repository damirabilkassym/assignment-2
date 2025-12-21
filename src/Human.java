public class Human {
    int age;
    String name;
    boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public Human() {
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

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getRole() {
        return "Human";
    }

    public void introduce() {
        System.out.println("My name is " + name + ", I am " + age + " years old.");
    }
}
