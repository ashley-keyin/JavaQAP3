package AbstractClasses;

public class Ellipse extends Shape {
  //The ellipse class has a major and minor axes a and b, respectively. 
  private double a; //major axes
  private double b; //minor axes 
  
  public Ellipse() {
    super();
  }

  public Ellipse(String name, double majorA, double minorB) {
    super(name);
    if (majorA > minorB) {
      this.a = majorA;
      this.b = minorB;
  } else {
      this.a = minorB;
      this.b = majorA;
  }
    
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

  @Override
  //[Note that if a = b = r, then P = 2πr]
  public double getPerimeter() {
    double perimeter = Math.PI * Math.sqrt(2*(a * a + b * b) - ((a-b)*(a-b)) /2 );
    return perimeter;
  }

  @Override
  public double getArea() {
    double area = Math.PI * a * b;
    return area;
  }
    // Method for applying a scale factor
    @Override
    public void scale(int factor) {
        this.a = this.a * factor;
        this.b = this.b * factor;
    }
  
  public String toString() {
    return super.toString() + "\n" + "Major Axis = " + this.a + ", Minor Axis = " + this.b;
  }
}
