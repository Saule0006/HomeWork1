import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args){
        //обьявление переменной String
        String myString;

        // константа NUM
        final int NUM = 10;

        //переменная word
        String word = "Hello";

        myString = String.valueOf(NUM + word);

        //распечатка переменных
        System.out.println("mySring: " + myString);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        //условная конструкция
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        //ввод имени
        System.out.println("Введите ваше имя: " );

        //создаем обьект scanner для ввода
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");

        //закрываем scanner
        scanner.close();
    }
}
