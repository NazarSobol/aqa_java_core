package main.java.aqa.core.lesson10.vriaboshapka;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName (String firstName){
        this.firstName=firstName;
    }
    public String getLastName (){
        return lastName;
    }
    public void setLastName (String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if(age>120 || age<0){
            this.age=age;
            throw new InvalidAgeException("Age is not suitable");
        }

    }
}
