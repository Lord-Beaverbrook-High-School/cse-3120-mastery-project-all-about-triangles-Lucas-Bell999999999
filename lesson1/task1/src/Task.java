import java.util.Arrays;

import static java.lang.Math.round;
import static java.util.Collections.sort;

public class Task {

    double side1 = 3;
    double side2 = 4;
    double side3 = 5;

public void setSides() {
    side1 = 3;
    side2 = 4;
    side3 = 5;
}

  public void setSides(double x, double y, double z) {
      double[] sides = {x, y, z};
      Arrays.sort(sides);
      side1 = sides[0];
      side2 = sides[1];
      side3 = sides[2];
  }

  public boolean isTriangle() {
      return side1 + side2 > side3;
  }

  public boolean isRightTriange() {
      return (round(Math.pow(side1, 2) * 100) / 100) + (round(Math.pow(side2, 2) * 100) / 100) == (round(Math.pow(side3, 2) * 100) / 100);
  }

 public double perimiter() {
    return side1 + side2 +side3;
 }

public double area() {
    double p = perimiter() / 2;
    return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
}

public void desplayTriangle() {
    System.out.println("Smallest Side " + side1);
    System.out.println("Medium Side " + side2);
    System.out.println("Largest Side " + side3);
}
  //put your task here
}