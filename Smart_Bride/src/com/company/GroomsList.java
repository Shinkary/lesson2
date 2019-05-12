package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GroomsList {

    public static int countGrooms() throws IOException {
        System.out.println("Какое количество предендентов?");
        BufferedReader count = new BufferedReader(new InputStreamReader(System.in));
        String inputCount = count.readLine();
        int userCount = Integer.parseInt(inputCount);
        return userCount;
    }

    public static List<String> groomsListName() throws IOException {
        String data = "src//com//resource//name.csv";

        List<String> listGrooms = new ArrayList<>();
        BufferedReader nameList = new BufferedReader(new FileReader(new File(data)));
        String read;
        while ((read = nameList.readLine()) != null){
            listGrooms.add(read);
        }

        nameList.close();

        Collections.shuffle(listGrooms);
        return listGrooms;

    }

    public static Groom [] fillGroomArray(int countGrooms, List<String> groomsListName){
        Groom[] groomList = new Groom[countGrooms];

        Random random = new Random();

        for (int i = 0; i < countGrooms; i++){
            groomList[i] = new Groom();
            groomList[i].name = groomsListName.get(i);
            groomList[i].iq = 70 + random.nextInt(111);
        }
        return groomList;
    }

    public static int countIn () throws IOException {
        System.out.println("Топ из скольки участников вывести на экран?");
        BufferedReader countRating = new BufferedReader(new InputStreamReader(System.in));
        String userCountString = countRating.readLine();
        int userCount = Integer.parseInt(userCountString);
        return userCount;
    }

    public static Groom [] arraySort (Groom [] groomArray, int userCount) {

        Groom best;

        for (int i = groomArray.length - 1; (i > 0) && (i >= groomArray.length - userCount - 1); i--){
            for (int y = 0; y < i; y++){
                if (groomArray[y].iq > groomArray[y+1].iq){
                    best = groomArray[y];
                    groomArray[y] = groomArray[y+1];
                    groomArray[y+1] = best;

                }
            }
        }
        return groomArray;
    }

    public static void groomListOut (int userCount, Groom [] groomArray) throws IOException {

        System.out.println("Топ-" + userCount + " женихов");
        int top = 1;

        for (int i = groomArray.length - 1; (i > 0) && (i > groomArray.length - userCount - 1); i--) {
            System.out.println(top + ". " + groomArray[i].name + " " + groomArray[i].iq);
            top++;
        }

    }

}
