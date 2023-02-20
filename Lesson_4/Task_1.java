//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.Scanner;
import java.util.Stack;

public class ConsoleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> strings = new Stack<>();

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                while (!strings.isEmpty()) {
                    System.out.println(strings.pop());
                }
            } else if (input.equals("revert")) {
                if (!strings.isEmpty()) {
                    strings.pop();
                } else {
                    System.out.println("No strings to revert.");
                }
            } else {
                strings.push(input);
            }
        }
    }
}
