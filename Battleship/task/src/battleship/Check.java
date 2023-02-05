package battleship;

public class Check {
    public static boolean isRightLenght(String startShip, String endShip, int lenghtShip) {
        int[] x = prepareCoordinates(startShip, endShip);
        return Math.abs(x[0] - x[1]) == lenghtShip - 1 || Math.abs(x[2] - x[3]) == lenghtShip - 1;
    }
    public static boolean isRightCoordinates(String startShip, String endShip) {
        int[] x = prepareCoordinates(startShip, endShip);
        return x[0] == x[1] || x[2] == x[3];
    }
    public static int[] prepareCoordinates(String startShip, String endShip) {
        String[] startShipArray = startShip.split("");
        String[] endShipArray = endShip.split("");
        int a = startShipArray[0].charAt(0) - 65;
        int b = endShipArray[0].charAt(0) - 65;
        int tempB = b;
        b = Math.max(a,b);
        a = Math.min(a,tempB);
        int c = Integer.parseInt(startShip.substring(1)) - 1;
        int d = Integer.parseInt(endShip.substring(1)) - 1;
        int tempD = d;
        d = Math.max(c,d);
        c = Math.min(c,tempD);
        return new int[] {a,b,c,d};
    }
    public static boolean ckeckUserInput(String userInput) {
        int[] x = prepareCoordinates(userInput, userInput);
        for (int c : x) {
            if (c < 0 || c > 9) {
                return false;
            }
        }
        return true;
    }
}
