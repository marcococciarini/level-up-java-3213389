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
    System.out.println("Hi! I'm " + this.getLastName() + " " + this.getFirstName() + " and I'm " + this.getAge() + " years old. Nice to meet you!");
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    if (age < this.age){
      System.out.println("you cannot make a person younger! Age " + age + " not set.");
    }
    else {
      this.age = age;
      System.out.println("New Age set to " + this.getAge());
    }
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