package AbstractClasses;

public class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;

  public Triangle() {

  }

  public Triangle(String name, double side1, double side2, double side3) {
    super(name);
    if((side1+side2>side3) && (side2+side3>side1) && (side3+side1>2)){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }else{
     System.out.println("Invalid side entry! Please try another number!");
   }
  }

  public double getSide1() {
    return side1;
  }
  public void setSide1(double side1) {
    this.side1 = side1;
  }
  public double getSide2() {
    return side2;
  }
  public void setSide2(double side2) {
    this.side2 = side2;
  }
  public double getSide3() {
    return side3;
  }
  public void setSide3(double side3) {
    this.side3 = side3;
  }

  @Override
  public double getPerimeter() {
    //perimeter = a + b + c
    return side1 + side2 + side3;
  }

  @Override
  public double getArea() {
    // s = (a+b+c)/2;
    // area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    double s = (side1+side2+side3)/2;
    return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    
  }

    // Method for applying a scale factor
   @Override
   public void scale(int factor) {
      this.side1 = this.side1 * factor;
      this.side2 = this.side2 * factor;
      this.side3 = this.side3 * factor;
     }
 
  public String toString() {
    return super.toString() + "\n" + "Side1 = " + this.side1 + ", Side2 = " + this.side2 + ", Side3 = " + this.side3;
  }
}
