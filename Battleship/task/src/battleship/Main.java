package battleship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean player1Move = true;
        Scanner scanner = new Scanner(System.in);


        BattleField bf1 = new BattleField();
        Print.printPlayer1Start();
        CreateBattleFields.create(bf1, scanner);
        Print.printPressEnter();
        scanner.nextLine();

        BattleField bf2 = new BattleField();
        Print.printPlayer2Start();
        CreateBattleFields.create(bf2, scanner);
        Print.printPressEnter();
        scanner.nextLine();
        System.out.println();

        while (true) {
            if (player1Move) {
                bf2.printFogBattleField();
                Print.printSeparator();
                bf1.printBattleField();
                Game.move(bf2,scanner, player1Move);
                Print.printPressEnter();
                scanner.nextLine();
                player1Move = false;
            } else {
                bf1.printFogBattleField();
                Print.printSeparator();
                bf2.printBattleField();
                Game.move(bf1,scanner, player1Move);
                scanner.nextLine();
                player1Move = true;
            }
        }
    }
}


