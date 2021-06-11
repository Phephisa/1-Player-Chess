package Pieces;

import java.util.ArrayList;

public class Rook {

    private String name = "B";

    public int x_pos = -1;
    public int y_pos = -1;

    ArrayList<String> validMoves = new ArrayList<String>();

    public void move() {

    }

    public ArrayList<String> getValidMoves() {
        validMoves.clear();
        bottom();
        top();
        left();
        right();
        return validMoves;
    }


    public void bottom()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (y <= 7 && y >= 0) {
                y--;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }

    public void top()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (y <= 7 && y >= 0) {
                y++;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }
    public void left()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (x <= 7 && x >= 0) {
                x--;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }
    public void right()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            while (x <= 7 && x >= 0) {
                x++;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);
            }
        }
    }

}