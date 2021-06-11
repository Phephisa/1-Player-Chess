package Pieces;

import java.util.ArrayList;

public class Bishop {

    private String name = "B";

    public int x_pos = -1;
    public int y_pos = -1;

    ArrayList<String> validMoves = new ArrayList<String>();

    public void move() {

    }

    public ArrayList<String> getValidMoves() {
        validMoves.clear();
        topRight();
        bottomLeft();
        topLeft();
        bottomRight();
        return validMoves;
    }

    public void topRight() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (x <= 6 && y <= 6) {
                x++;
                y++;
                //System.out.println("TR: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }

    public void bottomLeft() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (x >= 1 && y >= 1) {
                x--;
                y--;
                //System.out.println("BL: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }

    public void topLeft() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (x >= 1 && y <= 6) {
                x--;
                y++;
                //System.out.println("TL: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }

    public void bottomRight() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (x <= 6 && y >= 1) {
                x++;
                y--;
                //System.out.println("BR: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }
}