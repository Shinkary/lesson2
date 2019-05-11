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

    //заполнение массива рандомными числами
    public static int[] randomNumber (int userCount) throws IOException {
        Random randomNumbers = new Random();

        System.out.println("Вы выбрали вариант 1: Рандомно");
        System.out.println("Ваш массив будет состоять из " + userCount + " элементов");

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
            randomArray[i] = minRange + randomNumbers.nextInt(maxRange - minRange + 1);
        }

        System.out.println("Генерация завершена. Спасибо за ожидание.");

        return randomArray;
    }

    //заполнение массива вручную пользователем
    public static int[] manualNumbers (int userCount) throws IOException {
        System.out.println("Вы выбрали вариант 2: Вручную");
        System.out.println("Ваш массив будет состоять из " + userCount + " элементов");

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

    public static int [] bubbleSort (int [] userArr) {
        int maxNumber;
        for (int i = userArr.length - 1; i >= 0; i --){
            for (int y = 0; y < i; y++) {
                if (userArr[y] > userArr[y+1]){
                    maxNumber = userArr[y];
                    userArr[y] = userArr[y+1];
                    userArr[y+1] = maxNumber;
                }
            }
        }
        return userArr;
    }
}
