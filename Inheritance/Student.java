package Inheritance;

public class Student extends Person {
  protected String myIdNum; //Student Id Number
  protected double myGPA; //grade point average

  public Student(String name, int age, String gender, String idNum, double gpa) {
    
    super(name, age, gender); //use the super class' constructor

    //initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }

  public String getMyIdNum() {
    return myIdNum;
  }

  public void setMyIdNum(String myIdNum) {
    this.myIdNum = myIdNum;
  }

  public double getMyGPA() {
    return myGPA;
  }

  public void setMyGPA(double myGPA) {
    this.myGPA = myGPA;
  
  }

  @Override
  public String toString() {
    return super.toString() + ", GPA: " + myGPA + ", Id Number: " + myIdNum;
  }
}
