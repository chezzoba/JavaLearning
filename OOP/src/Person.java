public class Person {
    int age;
    String name;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person(name=%s, age=%d)", this.name, this.age);
    }
}
