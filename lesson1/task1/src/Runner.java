public class Runner {
    public static void main(String[] args){

        Task Triangle = new Task();
        Triangle.setSides(3.0, 4.0, 5.0);
//test
        System.out.println(Triangle.perimiter());
        System.out.println(Triangle.area());
        System.out.println(Triangle.isTriangle());
        System.out.println(Triangle.isRightTriange());

        Triangle.desplayTriangle();
        // prints the triangles side lenths


    }
}
