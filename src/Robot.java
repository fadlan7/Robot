import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] commandChar = new char[0];

        String initiatePosition = Helper.inputString("Tentukan posisi awal robot");
        String[] arrPosition = initiatePosition.split(",");

        String command = Helper.inputString("Input perintah");

        for (int i = 0; i < command.length(); i++) {
            commandChar = command.toCharArray();
        }

        System.out.println(commandChar);

        String direction = arrPosition[0];
        int x = Integer.parseInt(arrPosition[1]);
        int y = Integer.parseInt(arrPosition[2]);
    }


}
