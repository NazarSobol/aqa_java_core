package aqa.core.lesson10.alun;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age < 1 || age > 120){
            throw new InvalidAgeException();
        }
        this.age = age;
    }
}
