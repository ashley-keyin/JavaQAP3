package AbstractClasses;

public abstract class Shape {
  protected String name;

  public Shape(){

  }
  public Shape(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public abstract double getArea();
  public abstract double getPerimeter();

  public String toString() {
    String roundedP = String.format("%.1f", getPerimeter());
    String roundedA = String.format("%.1f", getArea());
    return "\n" + "Shape = " + name + "\n" + "Perimeter = " + roundedP + "\n" + "Area = " + roundedA;
  }

}
  

