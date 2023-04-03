package ru.itmo.lessons.lesson0708.properties;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();

        Handler handler = Handler.getInstance(fileName);
        handler.read();
        handler.write();
    }
}
