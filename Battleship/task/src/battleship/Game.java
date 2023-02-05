package battleship;

import java.util.Scanner;

public class Game {
    public static void move(BattleField bf, Scanner scanner, boolean player1Move) {
        if (player1Move) {
            System.out.println("\nPlayer 1, it's your turn:");
        } else {
            System.out.println("\nPlayer 2, it's your turn:");
        }
        System.out.println();

        while (true) {
            String userInput = scanner.nextLine();
//            if (Objects.equals(userInput,"")) {
//                continue;
//            }
            //System.out.println("XX:" + userInput);
            if (Check.ckeckUserInput(userInput)) {
                if (bf.checkShot(userInput)) {
                    if (bf.checkSank(userInput)) {
                        bf.deleteShip();
                        if (bf.getShipCount() == 0) {
                            Print.printYouSankLastShip();
                            break;
                        } else {
                            Print.printYouSankShip();
                        }
                    } else {
                        Print.printYouHitShip();
                    }
                    break;
                } else {
                    Print.printYouMissed();
                    break;
                }
            } else {
                Print.printEnterCoordinatesError();
            }
        }
    }
}
