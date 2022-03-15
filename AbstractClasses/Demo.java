package AbstractClasses;


public class Demo {
  public static void scaleDemo(Scalable[] arr, int factor) {

    for (Scalable obj : arr) {

        obj.scale(factor);
    }
}

  public static void main(String[] args) {
    Circle c1 = new Circle("Circle1", 5);
    Circle c2 = new Circle("Circle2", 8);
   
    Ellipse e1 = new Ellipse("Ellipse1", 10, 8);
    Ellipse e2 = new Ellipse("Elipse2", 5, 11);

    Triangle t1 = new Triangle("Triangle1", 3, 4, 5);
    Triangle t2 = new Triangle("Triangle2", 8, 7, 2);

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
       
      System.out.println("\n*** Objects Before Scaling: ***");
        for (Shape obj : objs) {
            System.out.println();
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("\n*** Objects After Scaling: ***");

        scaleDemo(objs, 3); // Apply scale factor of 3 to all objects in the objs array

        // print new scaled objects in the objs array
        for (Scalable obj : objs) {
            System.out.println();
            System.out.println(obj);
        }
    }
}
    
   


