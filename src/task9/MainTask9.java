package task9;

import java.util.Scanner;

public class MainTask9 {



    public static void main(String[] args) throws Exception {
        double d1;
        double d2;
//        1)
//            try(Scanner scanner = new Scanner(System.in);) {
//                System.out.println("d1: ");
//                d1 = scanner.nextInt();
//                System.out.println("d2: ");
//                d2 = scanner.nextInt();
//                Divider.div(d1,d2);
//            }
//            catch (NullPointerException | ArithmeticException e) {
//                System.out.println(e.getMessage());
//            }

//       2)
        try(Scanner scanner = new Scanner(System.in);) {
            System.out.println("d1: ");
            d1 = scanner.nextInt();
            int start = 3;
            int end = 8;
            NumberReader.readNumber(start,end,d1);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }
}
