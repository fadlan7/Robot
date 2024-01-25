public class RobotMoving {
    public void RobotMoving() {

        System.out.println("==================================== ROBOT ====================================");
        System.out.println("| - Posisi awal robot hanya input n(north),e(east),w(west),s(south)           |");
        System.out.println("| - Contoh input posisi awal: n,2,3                                           |");
        System.out.println("| - Input perintah:                                                           |");
        System.out.println("| A -> Mewakili gerakan 1 langkah maju searah dengan mata angin yang dihadapi |");
        System.out.println("| L -> Mewakili gerakan hadap kiri                                            |");
        System.out.println("| R -> Mewakili gerakan hadap kanan                                           |");
        System.out.println("| - contoh input perintah: AARAAAAAAAA                                        |");
        System.out.println("==============================================================================\n\n");

        String initiatePosition = Helper.inputString("Tentukan posisi awal robot");
        String[] arrPosition = initiatePosition.split(",");

        Direction direction = Direction.EAST;

        if (arrPosition[0].equals("e") || arrPosition[0].equals("E")) {
            direction = Direction.EAST;
        } else if (arrPosition[0].equals("w") || arrPosition[0].equals("W")) {
            direction = Direction.WEST;
        } else if (arrPosition[0].equals("n") || arrPosition[0].equals("N")) {
            direction = Direction.NORTH;
        } else if (arrPosition[0].equals("s") || arrPosition[0].equals("S")) {
            direction = Direction.SOUTH;
        }

        int x = Integer.parseInt(arrPosition[1]);
        int y = Integer.parseInt(arrPosition[2]);

        Robot robot = new Robot(direction, x, y);


        String command = Helper.inputString("Input perintah");

        for (char c : command.toCharArray()) {
            if (c == 'A') {
                robot.moveForward();
            } else if (c == 'L') {
                robot.turnLeft();
            } else if (c == 'R') {
                robot.turnRight();
            }

            System.out.println(
                    c + "-> (" + robot.getX() + "," + robot.getY() + ")"
            );
            System.out.printf("");
        }
    }
}
