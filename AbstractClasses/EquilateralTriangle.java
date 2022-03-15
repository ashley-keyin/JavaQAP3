package AbstractClasses;


public class EquilateralTriangle extends Shape {
  private double side;

  public EquilateralTriangle(String name, double side) {
    super(name);
    if (side > 0) {
        this.side = side;
    } else {
        System.out.println("Invalid side input. Please retry with valid number!");
        System.exit(0);
    }
  }
  
  @Override
  public double getArea() {
    //area = (√3 / 4) * side * side
    double area = (Math.sqrt(3)/4)*(side*side);
    return area;
}
  @Override
  public double getPerimeter() {
    double perimeter = side + side + side;
    return perimeter;
  }
    // Method for applying a scale factor
    @Override
    public void scale(int factor) {
        this.side = this.side * factor;
    }

  public String toString(){
    return super.toString() + "\n" + "Sides = " + this.side;

  }
}