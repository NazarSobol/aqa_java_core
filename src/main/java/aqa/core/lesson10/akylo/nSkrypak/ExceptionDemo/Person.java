package aqa.core.lesson10.akylo.nSkrypak.ExceptionDemo;

public class Person {
    String firstName;
    String lastName;
    int age;

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
    public void setAge(int age) {
        this.age = age;
    }
    public void setInvalidAge(int age) {
        if (age >= 120) {
            throw new InvalidAgeException;
        }if (age <= 1) {
            throw new InvalidAgeException;
        }
    }
}
