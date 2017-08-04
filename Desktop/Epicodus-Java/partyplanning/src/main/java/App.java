import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by spunek on 8/4/17.
 */
public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int guests = 0;
        String food = "";
        String beverages = "";
        String entertainment = "";
        boolean mainAppRunning = true;

        System.out.println("Hello EveryOne. Welcome to PDX Party! Want to have free Quote for Party? We can arrange party as per " +
                "your choice. Answer these Questions. Would you like us to have party for you? YES or NO");

        try {
            while (mainAppRunning) {
                String userAnswer = bufferedReader.readLine().toUpperCase();
                if (userAnswer.equals("NO")) {
                    System.out.println("How many guests are you expecting at your party? Enter number");
                    guests = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please choose one of the following for your food service: full course, light meal or snacks");
                    boolean checkFood = true;
                    while (checkFood) {
                        food = bufferedReader.readLine().toLowerCase();
                        if (food.equals("full course") || food.equals("light meal") || food.equals("snacks")) {
                            checkFood = false;
                        } else {
                            System.out.println("Sorry, we don't recognize your input. Please enter one of the following: " +
                                    "full course, light meal, snacks.");
                        }
                    }
                    System.out.println("Please choose one of the options for beverages: full bar, light refreshments, water");
                    boolean checkBeverage = true;
                    while (checkBeverage) {
                        beverages = bufferedReader.readLine().toLowerCase();
                        if (beverages.equals("full bar") || beverages.equals("light refreshments") || beverages.equals("water")) {
                            checkBeverage = false;
                        } else {
                            System.out.println("Sorry, we don't recognize your input. Please enter one of the following: " +
                                    "full bar, light refreshments, water.");
                        }
                    }
                    System.out.println("Please choose one of the following for your entertainment service: live band, DJ, none");
                    boolean checkEntertainment = true;
                    while (checkEntertainment) {
                        entertainment = bufferedReader.readLine().toLowerCase();
                        if (entertainment.equals("dj") || entertainment.equals("live band") || entertainment.equals("none")) {
                            checkEntertainment = false;
                        } else {
                            System.out.println("Sorry, we don't recognize your input. Please enter one of the " +
                                    "following: live band, DJ, none.");
                        }
                    }
                }
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

}
