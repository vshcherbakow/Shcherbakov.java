import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число b: ");
        int b = scanner.nextInt();


        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }


        System.out.println("Сумма a + b = " + (a + b));
        System.out.println("Разность a - b = " + (a - b));

        if (b != 0) {
            System.out.println("Частное a / b = " + ((double)a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        System.out.println("Произведение a * b = " + (a * b));
    }
}