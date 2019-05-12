package com.company;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        GroomsList list = new GroomsList();

        int countGroom = list.countGrooms();
        List<String> groomListName = list.groomsListName();

        Groom[] groomList;

        groomList = list.fillGroomArray(countGroom, groomListName);

//       полный список женихов
//        for (int i = 0; i < groomList.length; i++){
//            System.out.println(groomList[i].name + " " + groomList[i].iq);
//        }

        int count = list.countIn();

        Groom [] groomListSort = list.arraySort(groomList, count);

        list.groomListOut(count,groomListSort);

        boolean again;

        do {
            System.out.println("Желаете изменить количество женихов в ТОПе?");
            BufferedReader userAgain = new BufferedReader(new InputStreamReader(System.in));
            String userAgainIn = userAgain.readLine();
            if (userAgainIn.equalsIgnoreCase("да") || userAgainIn.equalsIgnoreCase("yes")){
                again = true;
                int countAgain = list.countIn();
                if (countAgain > count){
                    count = countAgain;
                    groomListSort = list.arraySort(groomList, count);
                    list.groomListOut(count, groomListSort);
                }
                else {
                    list.groomListOut(countAgain, groomListSort);
                }
            }
            else {
                break;
            }
        }
        while (again = true);


    }
}
