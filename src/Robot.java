import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initiatePosition;

        System.out.print("Tentukan posisi awal robot: ");
        initiatePosition = sc.nextLine();
        String[] arrPosition = initiatePosition.split(",");


//        System.out.print("Input perintah: ");
//        sc.nextLine();

        String direction = arrPosition[0];
        int x = Integer.parseInt(arrPosition[1]);
        int y = Integer.parseInt(arrPosition[2]);

        System.out.println(x);
    }
}
