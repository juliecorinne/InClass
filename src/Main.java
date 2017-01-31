import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        float length;
        float width;
        float height;

        boolean roomDetail = true;

        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        System.out.println();

        while (roomDetail) {

            System.out.print("Enter Length: ");
            length = scan1.nextFloat();

            System.out.print("Enter Width: ");
            width = scan1.nextFloat();

            System.out.print("Enter Height: ");
            height = scan1.nextFloat();

            float area = length * width;
            float parameter = ((length + length) + (width + width));
            float volume = (length * width * height);

            System.out.println("The area is " + area + ", the width is " + parameter + " and the volume is " + volume);
            System.out.println();

            System.out.println("Continue? Y/N");
            char y = scan1.next().charAt(0);

            if(y == 'Y'|| y == 'y'){
                roomDetail = true;

            } else {
                roomDetail = false;
                System.out.println("Bye!");
            }
        }
    }
}

