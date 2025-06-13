class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 18 ){
            this.age = age;
        } else {
            System.out.println("성인만 가입 가능.");
        }
    }
    public int getAge() {
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("hello");

        System.out.println(person.getName());
    }
}