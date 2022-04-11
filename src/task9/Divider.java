package task9;

public class Divider {

    static void div(double x,double y) throws Exception {
        if (x == 0||y==0) {
            throw new ArithmeticException("Exception: Can't divide by zero");
        }
        System.out.println(x/y);
    }

}
