package com.star.storage.tema;

public class Person {
    private String firstName,lastName;
    private int age;
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
        this.age = age;
    }
    //https://github.com/Ionut09/star-training.git
    public boolean isTeen() {
        return  (age >= 12 && age <= 20) ? true : false;
    }
    public String getFullName(){
        return firstName+lastName;
    }
}
