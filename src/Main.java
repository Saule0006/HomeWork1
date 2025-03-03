import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String myString;
        final int NUM = 10;
        String word = "Hello";
        myString = String.valueOf(NUM + word);
        System.out.println("mySring: " + myString);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя: " );

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");

        scanner.close();
    }
}