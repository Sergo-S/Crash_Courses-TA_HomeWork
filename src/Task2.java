import java.util.Scanner;

public class Task2 {

    static void areContainsThree(int n){
        String str = Integer.toString(n*n);
        if (str.contains("3")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    static void reverseDigits(int n){
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        sb.reverse();
        System.out.println(sb);
    }


    static void swapFirstAndLastDigit(int n){
        String str = Integer.toString(n);
        char[] c = str.toCharArray();
        char temp = c[0];
        c[0] = c[str.length()-1];
        c[str.length()-1] = temp;
        String swappedN = new String(c);
        System.out.println(swappedN);
    }

    static void addOne(int n){
        String str = Integer.toString(n);
        System.out.println("1"+str+"1");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        areContainsThree(n);

        reverseDigits(n);

        swapFirstAndLastDigit(n);

        addOne(n);

    }
}
