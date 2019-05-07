package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Сортирвка чисел");

        ArrayOfNumbers userArr = new ArrayOfNumbers();

        int userCount = userArr.CountNumber();
        int [] userNumbers = new int[userCount];

        System.out.println("Как будет осуществляться ввод чисел?");
        System.out.println("1. Рандомно");
        System.out.println("2. Вручную");

        BufferedReader typeInput = new BufferedReader((new InputStreamReader(System.in)));
        String userTypeInput = typeInput.readLine();

        if (userTypeInput.equalsIgnoreCase("1") || userTypeInput.equalsIgnoreCase("1.") ||
                userTypeInput.equalsIgnoreCase("1. Рандомно") || userTypeInput.equalsIgnoreCase("1.Рандомно") ||
                userTypeInput.equalsIgnoreCase("Рандомно") || userTypeInput.equalsIgnoreCase("Рандом"))
        {
            userNumbers = userArr.randomNumber(userCount);
        }
        else if (userTypeInput.equalsIgnoreCase("2") || userTypeInput.equalsIgnoreCase("2.") ||
                userTypeInput.equalsIgnoreCase("2. Вручную") || userTypeInput.equalsIgnoreCase("2.Вручную") ||
                userTypeInput.equalsIgnoreCase("Вручную") || userTypeInput.equalsIgnoreCase("Руками"))
        {
            userNumbers = userArr.manualNumbers(userCount);
        }


        for (int i = 0; i < userCount; i++){
            System.out.println(userNumbers[i]);
        }
    }
}
