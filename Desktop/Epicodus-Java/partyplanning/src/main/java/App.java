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
            while (mainAppRunning){
                String userAnswer = bufferedReader.readLine().toUpperCase();
                
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

}
