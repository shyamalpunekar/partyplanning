import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                    System.out.println("Please choose one of the options for beverages: ull bar, light refreshments, water");


                }

            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

}
