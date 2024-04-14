//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TaskThree
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа:");

        for (int number : numbers)
        {
            if (number % 2 == 0)
            {
                System.out.println(number);
            }
        }
    }
}