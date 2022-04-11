package Task5;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

enum HTTPError{
    ERR200("200 - OK"),
    ERR301("301 - Moved Permanently"),
    ERR302("302 - Found"),
    ERR303("304 -  Not Modified"),
    ERR403("403 - Forbidden"),
    ERR404("404 - Not Found"),
    ERR500("500 - Internal Server Error"),
    ERR502("502 - Bad Gateway "),
    ERR503("503 - Service Unavailable"),
    ERR504("504 - Gateway Timeout");
    private String description;
    HTTPError(String description){
        this.description = description;
    }
    public void getCode(){
        System.out.println(this.description); ;}
}

public class MainTask5 {

    static void range(float[] floatArray){
        Scanner scanner = new Scanner(System.in);
        for (float i:floatArray){
            System.out.println("arr = ");
            i = scanner.nextFloat();
            if(i<=5&&i>=-5){
                System.out.println(i+" -belong to the range [-5;5]");
            }
            else System.out.println(i+" -not belong to the range [-5;5]");
        }
    }

    static void writeMaxAndMin(int[] intArray){
        Scanner scanner = new Scanner(System.in);
        int min = 9999 ;
        int max = -9999;
        for(int i=0;i<intArray.length;i++){
            System.out.println("arr = ");
            intArray[i] = scanner.nextInt();
        }

        for(int i=0;i<intArray.length;i++){
            if(intArray[i] < min){
                min = intArray[i];
                i=0;
            }
        }
        for(int i=0;i<intArray.length;i++){
            if(intArray[i] > max){
                max = intArray[i];
                i=0;
            }
        }
        System.out.println("Max number = "+max+" Min number = "+min);
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] floatArray = new float[3];
        int[] intArray = new int[3];

//        1.1)
//        range(floatArray);
//        1.2)
//        writeMaxAndMin(intArray);
//        1.3)
//        int errcode = 1;
//        while(errcode != 0){
//            System.out.println("Enter HTTP code (Enter 0 to exit):");
//            errcode = scanner.nextInt();
//            switch(errcode) {
//                case 200:
//                    HTTPError.ERR200.getCode();
//                    break;
//                case 301:
//                    HTTPError.ERR301.getCode();
//                    break;
//                case 302:
//                    HTTPError.ERR302.getCode();
//                    break;
//                case 303:
//                    HTTPError.ERR303.getCode();
//                    break;
//                case 403:
//                    HTTPError.ERR403.getCode();
//                    break;
//                case 404:
//                    HTTPError.ERR404.getCode();
//                    break;
//                case 500:
//                    HTTPError.ERR500.getCode();
//                    break;
//                case 502:
//                    HTTPError.ERR502.getCode();
//                    break;
//                case 503:
//                    HTTPError.ERR503.getCode();
//                    break;
//                case 504:
//                    HTTPError.ERR504.getCode();
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("We haven't a description for this code");
//                    break;
//            }
//        }

//        2)
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("Kelly",5,Breed.HUSKY);
        dogs[1] = new Dog("Kelly",2,Breed.SHEPHERD_DOG);
        dogs[2] = new Dog("Honda",10,Breed.LABRADOR);
        dogs[3] = new Dog("Bobik",12,Breed.BULLDOG);
        dogs[4] = new Dog("Honda",3,Breed.LABRADOR);

//        Dog.sameName(dogs);
//        Dog.theOldestDog(dogs);








    }
}
