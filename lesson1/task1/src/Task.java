import java.util.Arrays;

import static java.lang.Math.round;
import static java.util.Collections.sort;

public class Task {

    double side1 = 3;
    double side2 = 4;
    double side3 = 5;

public void setSides() {
    //sets sides to a default if no lengths are provides
    side1 = 3;
    side2 = 4;
    side3 = 5;
}

  public void setSides(double x, double y, double z) {
    //uses an array to sort the sides from smallest to largest
      double[] sides = {x, y, z};
      Arrays.sort(sides);
      side1 = sides[0];
      side2 = sides[1];
      side3 = sides[2];
  }

  public boolean isTriangle() {
    // figures out if sides can form a valid triangle by testing if the 2 smaller sides are longer when combined then the large side
      return side1 + side2 > side3;
  }

  public boolean isRightTriange() {
    // uses provides formula to determine if a triangle is a right triangle
      return (round(Math.pow(side1, 2) * 100) / 100) + (round(Math.pow(side2, 2) * 100) / 100) == (round(Math.pow(side3, 2) * 100) / 100);
  }

 public double perimiter() {
    // adds sides to find perimiter
    return side1 + side2 +side3;
 }

public double area() {
    //calculating ares using provided formula
    double p = perimiter() / 2;
    return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
}

public void desplayTriangle() {
    // printing side lengths
    System.out.println("Smallest Side " + side1);
    System.out.println("Medium Side " + side2);
    System.out.println("Largest Side " + side3);
}
  //put your task here
}