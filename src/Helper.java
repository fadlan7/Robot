import java.util.Scanner;

public class Helper {
    public static String inputString(String info) {
        System.out.printf("%s : ", info);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
