package com.linkedin.javacodechallenges;

public class Person {
  
  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;    
  }

  public void introducePerson(){
    System.out.println("Hi! I'm " + this.lastName + " " + this.firstName + " and I'm " + this.age + " years old. Nice to meet you!");
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName  = lastName;
  }
}