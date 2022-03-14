package AbstractClasses;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
       
      Scanner s1= new Scanner(System.in);
        
         System.out.println("Enter the 1st side:");
         int side1= s1.nextInt();
 
         System.out.println("Enter the 2nd side:");
          int side2= s1.nextInt();
 
         System.out.println("Enter the 3rd side:");
         int side3= s1.nextInt();

      Triangle t1 = new Triangle();
        if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1)
          {
            System.out.println("Area of Triangle = " + t1.getArea());    
           }
         else  
           System.out.println("Area of Triangle does not exist");
   }
}

