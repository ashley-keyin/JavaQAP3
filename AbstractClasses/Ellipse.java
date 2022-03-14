package AbstractClasses;

public class Ellipse {
  protected double radius;
  protected double a; //major axes
  protected double b; //minor axes 
  
  public Ellipse() {
  }

  public Ellipse(double radius) {
    this.radius = radius;
  }

  public Ellipse(String name, double radius, double a, double b) {
    super();
    this.radius = radius;
    this.a = a;
    this.b = b;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public void setA(double a) {
    this.a = a;
  }
  public void setB(double b) {
    this.b = b;
  }

  //[Note that if a = b = r, then P = 2πr]
  public double getPerimeter() {
    double perimeter = (double)2 * Math.PI * Math.sqrt((a * a + b * b) / (2 * 1.0));
    return perimeter;
  }

  public double getArea() {
    double area = Math.PI * a * b;
    return area;
  }

  @Override
  public String toString() {
    return super.toString() + " Radius = " + this.radius + " Perimeter = " + getPerimeter() + " Area = " + getArea();
  }
  
}
