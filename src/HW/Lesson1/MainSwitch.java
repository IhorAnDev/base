package HW.Lesson1;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedote pervoe chislo");
        int firstNum = scanner.nextInt();
        System.out.println("Vvedote vtoroe chislo");
        int secondNum = scanner.nextInt();

        System.out.println("1 - slojanie; 2 - vichitaniye; 3 - deleniye; 4 - deleniye s ostatkom ");
        int result = scanner.nextInt();

        switch (result) {
            case 1:
                System.out.println(firstNum + secondNum);
                break;
            case 2:
                System.out.println(firstNum - secondNum);
                break;
            case 3:
                System.out.println(firstNum / secondNum);
                break;
            case 4:
                System.out.println(firstNum % secondNum);
                break;

        }

    }
}
