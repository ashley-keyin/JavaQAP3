package Inheritance;

public class HighschoolAppTest {
  public static void main(String [] args) {
    Person bob = new Person("Coach Bob" , 27, "M");
    System.out.println(bob);

    Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
    System.out.println(lynne);

    Teacher ainee = new Teacher("Ainee Q", 35, "F", "Java", 80000);
    System.out.println(ainee);

    CollegeStudent ashley = new CollegeStudent("Ashley", 35, "F", "1", 4.0, 4, "Software Development");
    System.out.println(ashley);
  }
}
