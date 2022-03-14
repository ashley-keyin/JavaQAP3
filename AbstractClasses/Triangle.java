package AbstractClasses;

public class Triangle extends EquilateralTriangle {
  protected int side1;
  protected int side2;
  protected int side3;

  public Triangle() {

  }

  public Triangle(String name, int side1, int side2, int side3) {
    super();
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public int getSide1() {
    return side1;
  }
  public void setSide1(int side1) {
    this.side1 = side1;
  }
  public int getSide2() {
    return side2;
  }
  public void setSide2(int side2) {
    this.side2 = side2;
  }
  public int getSide3() {
    return side3;
  }
  public void setSide3(int side3) {
    this.side3 = side3;
  }

  public int getPerimeter() {
    //perimeter = a + b + c
    return side1 + side2 + side3;
  }

  public double getArea() {
    // s = (a+b+c)/2;
    // area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    int s = (side1+side2+side3)/2;
    double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
    
  }

  public String toString() {
    return "Side 1 = " + this.side1 + ", Side 2 = " + this.side2 + ", Side 3 = " + this.side3 + ", Perimeter = " + getPerimeter() + ", Area = " + getArea();
  }
}
