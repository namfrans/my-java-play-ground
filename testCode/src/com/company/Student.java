package com.company;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private int number;
    private static int count = 0;


    public Student() {
        count++;
    }


    public Student(String firstname, String lastname, int age, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        count++;
        this.number = count;
    }


    public String toString() {
        return "Full names : " + this.firstname + " " + this.lastname + "\nAge : " + this.age + "\nGender : "
                + this.gender + "\nStudent Number : " + String.format("22201%03d", this.number);
    }


    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }


    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }


    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }


    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }


    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }


    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }


    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

}
