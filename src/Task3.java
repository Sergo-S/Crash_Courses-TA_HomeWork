import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1)
        System.out.println("radius: ");
        double radius = scanner.nextDouble();
        double circum;
        double area;

        area = Math.PI*radius*radius;
        circum = 2*Math.PI*radius;

        System.out.println("area = "+area+" or "+(radius*radius)+'\u03C0');
        System.out.println("circle length = "+circum+" or "+(2*radius)+'\u03C0');

//        2)
//        System.out.println("What is your name?");
//        String name = new String(scanner.next());
//        System.out.println("Where are you live,"+ name +"?");
//        String address = new String(scanner.next());
//        System.out.println("Hello "+ name +" from "+ address +"!");

//        3)
//        System.out.println("Enter c1:");
//        int c1 = scanner.nextInt();
//        System.out.println("Enter c2:");
//        int c2 = scanner.nextInt();
//        System.out.println("Enter c3:");
//        int c3 = scanner.nextInt();
//        System.out.println("Enter t1:");
//        int t1 = scanner.nextInt();
//        System.out.println("Enter t2:");
//        int t2 = scanner.nextInt();
//        System.out.println("Enter t3:");
//        int t3 = scanner.nextInt();
//
//        System.out.println("First call: "+ c1*t1);
//        System.out.println("Second call: "+ c2*t2);
//        System.out.println("Third call: "+ c3*t3);
//        System.out.println("All cost: "+ (c1*t1+c2*t2+c3*t3));

    }
}
