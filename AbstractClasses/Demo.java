package AbstractClasses;


public class Demo {
  public static void main(String[] args) {
    Circle c1 = new Circle("Circle1", 5);
    Circle c2 = new Circle("Circle2", 8);
   
    Ellipse e1 = new Ellipse("Ellipse1", 10, 8);
    Ellipse e2 = new Ellipse("Elipse2", 5, 11);

    Triangle t1 = new Triangle("Triangle1", 3, 6, 9);
    Triangle t2 = new Triangle("Triangle2", 7, 10, 2);

    EquilateralTriangle et1 = new EquilateralTriangle("Equilateral1", 5);
    EquilateralTriangle et2 = new EquilateralTriangle("Equilateral2", 7);

  


  
  
    Shape objs[] = new Shape[8];
        objs[0] = c1;
        objs[1] = c2;
        objs[2] = e1;
        objs[3] = e2;
        objs[4] = t1;
        objs[5] = t2;
        objs[6] = et1;
        objs[7] = et2;
       

        for (Shape obj : objs) {
            System.out.println();
            System.out.println(obj);
        }
    
   }
}

