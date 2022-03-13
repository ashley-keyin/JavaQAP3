package Inheritance;

public class Teacher extends Person{
  protected String subject;
  protected double salary;
  
  public Teacher(String myName, int age, String myGender, String subject, double salary) {
    super(myName, age, myGender);
    this.subject = subject;
    this.salary = salary;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString() + ", Salary: " + salary + ", Subject: " + subject;
  }
}
