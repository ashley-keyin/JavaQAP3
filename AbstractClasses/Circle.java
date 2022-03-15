package AbstractClasses;

public class Circle extends Shape {
  private double radius;

  public Circle() {
  }

  Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  public String toString() {
    return super.toString() + "\n" + "Radius = " + this.radius;
  }

}
