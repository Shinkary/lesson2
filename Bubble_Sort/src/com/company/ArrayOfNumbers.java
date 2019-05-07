package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArrayOfNumbers {

    public  static int CountNumber () throws IOException {
        System.out.println("Сколько чисел необходимо отсортировать?");
        BufferedReader count = new BufferedReader(new InputStreamReader(System.in));
        String inputCount = count.readLine();
        int userCount = Integer.parseInt(inputCount);
        return userCount;
    }

    public static int[] randomNumber (int userCount) throws IOException {
        Random randomNumbers = new Random();

        System.out.println("Вы выбрали вариант 1: Рандомно");

        System.out.println("Какому диапозону должны соответсвовать числа(включительно)?");

        BufferedReader range = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Начиная от ");
        String userRange = range.readLine();
        int minRange = Integer.parseInt(userRange);

        System.out.print("Заканчивая ");
        userRange = range.readLine();
        int maxRange = Integer.parseInt(userRange);

        System.out.println("Подождите пока числа сгененерируются... ");

        int [] randomArray = new int[userCount];

        for (int i = 0; i < userCount; i++) {
            randomArray[i] = minRange + randomNumbers.nextInt(maxRange+1);
        }

        System.out.println("Генерация завершена. Спасибо за ожидание.");

        return randomArray;
    }

    public static int[] manualNumbers (int userCount) throws IOException {
        System.out.println("Вы выбрали вариант 2: Вручную");

        System.out.println("Введите желаемые числа:");

        int [] userArray = new int[userCount];

        BufferedReader range = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < userCount; i++){
            System.out.print(i+1 + ". ");
            String number = range.readLine();
            int userNum = Integer.parseInt(number);
            userArray[i] = userNum;
        }
        return  userArray;
    }
}
