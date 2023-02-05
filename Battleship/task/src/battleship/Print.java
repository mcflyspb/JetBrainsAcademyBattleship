package battleship;

public class Print {
    private final static String WRONG_SHIP_COORDINATES = "\nError! Wrong ship location! Try again:";
    private final static String INSERT_ERROR = "\nError! Wrong ship location! Try again:";
    private final static String  GAME_STARTED = "\nThe game starts!";
    private final static String  YOU_HIT_SHIP = "\nYou hit a ship!";
    private final static String  YOU_SANK_SHIP = "\nYou sank a ship!";
    private final static String  YOU_SANK_LAST_SHIP = "\nYou sank the last ship. You won. Congratulations!";
    private final static String WRONG_ENTER_COORDINATES = "\nError! You entered the wrong coordinates! Try again:";
    private final static String  YOU_MISSED = "\nYou missed!";
    private final static String  SANK_LAST_SHIP = "\nYou sank the last ship. You won. Congratulations!";
    private final static String  PLAYER1_START = "\nPlayer 1, place your ships on the game field";
    private final static String  PLAYER2_START = "\nPlayer 2, place your ships on the game field";
    private final static String  PRESS_ENTER = "Press Enter and pass the move to another player";

    static void printYouHitShip() {
        System.out.println(YOU_HIT_SHIP);
    }
    static void printYouSankShip() {
        System.out.println(YOU_SANK_SHIP);
    }
    static void printYouSankLastShip() {
        System.out.println(SANK_LAST_SHIP);
    }
    public static void printYouMissed() {
        System.out.println(YOU_MISSED);
    }
    public static void printEnterCoordinatesError() {
        System.out.println(WRONG_ENTER_COORDINATES);
    }
    public static void printShipCoordinatesError() {
        System.out.println(WRONG_SHIP_COORDINATES);
    }
    public static void printInvate(String name, int lenghtShip) {
        System.out.printf("\nEnter the coordinates of the %s (%d cells):\n", name, lenghtShip);
    }
    public static void printInsertError() {
        System.out.println(INSERT_ERROR);
    }
    public static void printGameStardted() {
        System.out.println(GAME_STARTED);
    }
    public static void printPlayer1Start() {
        System.out.println(PLAYER1_START);
    }
    public static void printPlayer2Start() {
        System.out.println(PLAYER2_START);
    }
    public static void printPressEnter() {
        System.out.println(PRESS_ENTER);
    }
    public static void printLenghtError(String name) {
        System.out.printf("Error! Wrong length of the %s! Try again:\n", name);
    }

    public static void printSeparator() {
        System.out.println("----------------------");
    }
}
