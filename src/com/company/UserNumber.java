package com.company;

import java.util.Scanner;

public class UserNumber {

    public static double inputNumber (String x){ //Ввод данных пользователем
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Введите число " + x);
        double userNumber = getNumber.nextDouble();
        return userNumber;
    }


}
