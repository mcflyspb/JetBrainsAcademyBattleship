package battleship;
public class BattleField {
    int[][] xy;
    int shipsCount;
    BattleField() {
        xy = new int[10][10];
        shipsCount = 0;
    }

    public void addShip() {
        shipsCount++;
    }

    public void deleteShip() {
        shipsCount--;
    }

    public int getShipCount() {
        return shipsCount;
    }


    public boolean isPossibleInsertNewShip(String startShip, String endShip, int lenghtShip) {
        int[] z = Check.prepareCoordinates(startShip, endShip);
        if (z[0] > 0) z[0]--;
        if (z[1] < 8) z[1]++;
        if (z[2] > 0) z[2]--;
        if (z[3] < 8) z[3]++;
        for (int x = z[0]; x <= z[1]; x++) {
            for (int y = z[2]; y <= z[3]; y++) {
                if (xy[x][y] == 1) return false;
            }
        }
        return true;
    }
    void printBattleField () {
        //System.out.println();
        System.out.print("  ");
        for (int x = 1; x <= 10; x++ ) {
            System.out.print(" " + x);
        }
        for (int x = 0; x < 10; x++ ) {
            System.out.println();
            char c = (char) (x + 65);
            System.out.print(" " + c);
            for (int y = 0; y < 10; y++) {
                if (xy[x][y] == 0) {
                    System.out.print(" ~");
                } else if (xy[x][y] == 1) {
                    System.out.print(" O");
                } else if (xy[x][y] == 2) {
                    System.out.print(" X");
                } else if (xy[x][y] == 3) {
                    System.out.print(" M");
                }
            }
        }
        System.out.println();
    }

    void printFogBattleField () {
        //System.out.println();
        System.out.print("  ");
        for (int x = 1; x <= 10; x++ ) {
            System.out.print(" " + x);
        }
        for (int x = 0; x < 10; x++ ) {
            System.out.println();
            char c = (char) (x + 65);
            System.out.print(" " + c);
            for (int y = 0; y < 10; y++) {
                if (xy[x][y] <= 1) {
                    System.out.print(" ~");
                } else if (xy[x][y] == 2) {
                    System.out.print(" X");
                } else if (xy[x][y] == 3) {
                    System.out.print(" M");
                }
            }
        }
        System.out.println();
    }
    public void insertNewShip(String startShip, String endShip) {
        int[] z = Check.prepareCoordinates(startShip, endShip);
        if (z[0] == z[1]) {
            for (int x = z[2]; x <= z[3]; x++) {
                xy[z[0]][x] = 1;
            }
        } else {
            for (int x = z[0]; x <= z[1]; x++) {
                xy[x][z[2]] = 1;
            }
        }
    }
    public boolean checkShot(String userInput) {
        int[] z = Check.prepareCoordinates(userInput, userInput);
        if (xy[z[0]][z[2]] == 1 || xy[z[0]][z[2]] == 2) {
            xy[z[0]][z[2]] = 2;
            return true;
        } else {
            xy[z[0]][z[2]] = 3;
            return false;
        }
    }

    public boolean checkLastShot() {
        for (int x = 0; x < 10; x++ ) {
            for (int y = 0; y < 10; y++) {
                if (xy[x][y] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkSank(String userInput) {
        int[] z = Check.prepareCoordinates(userInput, userInput);
        int x = z[0];
        int y = z[2];
        boolean sank = true;
        for (int a = x; a <= 9; a++) {
            if (xy[a][y] == 1) {
                return false;
            } else if (xy[a][y] == 2) {
                continue;
            }
            else break;
        }

        for (int a = x; a >= 0; a--) {
            if (xy[a][y] == 1) {
                return false;
            } else if (xy[a][y] == 2) {
                continue;
            }
            else break;
        }

        for (int a = y; a <= 9; a++) {
            if (xy[x][a] == 1) {
                return false;
            } else if (xy[x][a] == 2) {
                continue;
            }
            else break;
        }

        for (int a = y; a >= 0; a--) {
            if (xy[x][a] == 1){
                return false;
            } else if (xy[x][a] == 2) {
                continue;
            }
            else break;
        }

        return true;

//        if (xy[x][y] == 0) {
//            System.out.print(" ~");
//        } else if (xy[x][y] == 1) {
//            System.out.print(" O");
//        } else if (xy[x][y] == 2) {
//            System.out.print(" X");
//        } else if (xy[x][y] == 3) {
//            System.out.print(" M");
//        }


    }

}
