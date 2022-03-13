package Inheritance;

public class Person {
  protected String myName; //name of the person
  protected int myAge; //person's age
  protected String myGender; //"M" fpr male, "F" for female
  
  public Person(String name, int age, String gender) {
    this.myName = name;
    this.myAge = age;
    this.myGender = gender;
  }

  public int getMyAge() {
    return myAge;
  }
  public String getMyGender() {
    return myGender;
  }
  public String getMyName() {
    return myName;
  }
  public void setMyAge(int myAge) {
    this.myAge = myAge;
  }
  public void setMyGender(String myGender) {
    this.myGender = myGender;
  }
  public void setMyName(String myName) {
    this.myName = myName;
  }

  public String toString() {
    return "Name: " + myName + ", Age: " + myAge  + ", Gender: " + myGender;  }
  
}
