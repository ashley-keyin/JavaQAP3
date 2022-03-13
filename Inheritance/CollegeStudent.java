package Inheritance;

public class CollegeStudent extends Student{
  protected String major; //ex. "Electrical Engineering", "Communications", "Undeclared"
  protected int year; //ex. FROSH =1, SOPH = 2

 public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double d, int year, String major) {
   super(myName, myAge, myGender, myIdNum, d);
   this.major = major;
   this.year = year; 
 }

public String getMajor() {
  return major;
}

public void setMajor(String major) {
  this.major = major;
}

public int getYear() {
  return year;
}

public void setYear(int year) {
  this.year = year;
}

@Override
public String toString() {
  return "CollegeStudent: \n" + super.toString() + ", Major: " + major + ", Year: " + year;
}
}
