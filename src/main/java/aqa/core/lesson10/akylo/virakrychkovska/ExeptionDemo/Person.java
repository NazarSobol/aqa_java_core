package main.java.aqa.core.lesson10.akylo.virakrychkovska.ExeptionDemo;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person() {
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) throws InvalidAgeException {
        if (age > 120 || age < 0) throw new InvalidAgeException();
        this.age = age;
    }
}
