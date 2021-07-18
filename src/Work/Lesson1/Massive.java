package Work.Lesson1;

import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("vvedite cifru  ");
            array[i] = input.nextInt();
        }

        printMass(array);
        printDayOfWeek(7);
    }


    public static void printMass(int[] array) {
        for (int el : array) {
            System.out.println("el zapolnyaetsa " + el);
        }
    }

    public static void printDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Poned");
                break;
            case 2:
                System.out.println("vtornik");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Chetverg");
                break;
            case 5:
                System.out.println("Pyatnica");
                break;
            case 6:
                System.out.println("Subbota");
                break;
            case 7:
                System.out.println("Voskresenye");
                break;
        }
    }

}
