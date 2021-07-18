package HW.Lesson1;

import java.util.Random;
import java.util.Scanner;

public class Lesson1_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("vvedite rasmer massiva");

        int result = input.nextInt();

        int[] arrays = new int[result];

        Random random = new Random();

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(30);
            System.out.println(arrays[i]);
        }

        System.out.println("vvedite chislo dlya poiska");
        int number = input.nextInt();


        for (int el:arrays){
            if(el == number){
                System.out.println("chisla ravni");
            }else {
                System.out.println("eche raz");
            }
        }
        int max = arrays[0];
        for(int el:arrays){
            if(el > max){
                max = el;
            }
        }
        System.out.println("max znachenie "  + max);
    }
}
