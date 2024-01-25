import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initiatePosition;
        char[] commandChar = new char[0];

        System.out.print("Tentukan posisi awal robot: ");
        initiatePosition = sc.nextLine();
        String[] arrPosition = initiatePosition.split(",");

        System.out.print("Input perintah: ");
        String command = sc.nextLine();

        for (int i = 0; i < command.length(); i++) {
            commandChar = command.toCharArray();
        }

        System.out.println(commandChar);

        String direction = arrPosition[0];
        int x = Integer.parseInt(arrPosition[1]);
        int y = Integer.parseInt(arrPosition[2]);

    }
}
