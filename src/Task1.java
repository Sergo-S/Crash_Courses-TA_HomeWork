import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();

        if((a<=x&&c<=y)||(a<=y&&c<=x)){
            System.out.println("true");
        }
        else if((b<=x&&c<=y)||(c<=x&&b<=y)){
            System.out.println("true");
        }
        else if((a<=x&&b<=y)||(b<=x&&a<=y)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
