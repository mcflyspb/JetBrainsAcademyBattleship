package battleship;

import java.util.Scanner;

public class CreateBattleFields {

    public static void create(BattleField bf, Scanner scanner) {
        String startShip;
        String endShip;

        bf.printBattleField();
        for (Ship ship : Ship.values()) {
            while (true) {
                Print.printInvate(ship.getPrintName(), ship.getLength());
                String[] input = scanner.nextLine().trim().split(" ");
                startShip = input[0];
                endShip = input[1];
                boolean isRightCoordinates = Check.isRightCoordinates(startShip, endShip);
                boolean isRightLenght = Check.isRightLenght(startShip, endShip, ship.getLength());
                boolean isPossibleInsertNewShip = bf.isPossibleInsertNewShip(startShip, endShip, ship.getLength());

                if (!isRightCoordinates) {
                    Print.printShipCoordinatesError();
                    continue;
                }

                if (!isRightLenght) {
                    Print.printLenghtError(ship.getPrintName());
                    continue;
                }
                if (!isPossibleInsertNewShip) {
                    Print.printInsertError();
                    continue;
                }
                bf.insertNewShip(startShip, endShip);
                bf.addShip();
                bf.printBattleField();
                break;
            }
        }
    }
}
