package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Сортирвка чисел");

        ArrayOfNumbers userArr = new ArrayOfNumbers(); //объявление объекта



        System.out.println("Как будет осуществляться ввод чисел?");
        System.out.println("1. Рандомно");
        System.out.println("2. Вручную");

        BufferedReader typeInput = new BufferedReader((new InputStreamReader(System.in)));
        String userTypeInput = typeInput.readLine();

        int userCount = userArr.CountNumber(); //ввод количества элементов массива
        int [] userNumbers = new int[userCount];

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

        System.out.println("Сортировка чисел необходима:");
        System.out.println("1. От меньшего к большему");
        System.out.println("2. От большего к меньшему");

        userNumbers = userArr.bubbleSort(userNumbers);

        BufferedReader sortType = new BufferedReader(new InputStreamReader(System.in));
        String userSortType = sortType.readLine();
        if (userSortType.equalsIgnoreCase("1") || userSortType.equalsIgnoreCase("1.") ||
        userSortType.equalsIgnoreCase("1. От меньшего к большему") || userSortType.equalsIgnoreCase("От меньшего к большему"))
        {
            for (int i = 0; i < userCount; i++){
                System.out.println(userNumbers[i]);
            }
        }
        else if (userSortType.equalsIgnoreCase("2") || userSortType.equalsIgnoreCase("2.") ||
                userSortType.equalsIgnoreCase("2. От большего к меньшему") || userSortType.equalsIgnoreCase("От большего к меньшему")){
            for (int i = userNumbers.length - 1 ; i >= 0; i--){
                System.out.println(userNumbers[i]);
            }
        }
    }
}
