package Pieces;

import java.util.ArrayList;

public class Pawn {

    private String name = "B";

    public int x_pos = -1;
    public int y_pos = -1;

    ArrayList<String> validMoves = new ArrayList<String>();

    public void move() {

    }

    public ArrayList<String> getValidMoves() {
        validMoves.clear();
        top();
        return validMoves;
    }


    public void top() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

                y++;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }
}
