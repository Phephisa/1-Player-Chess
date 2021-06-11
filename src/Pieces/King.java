package Pieces;
import java.util.Vector;

import java.util.ArrayList;

public class King {

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
        bottom();
        top();
        left();
        right();
        return validMoves;
    }

    public void topRight() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


                x++;
                y++;
                //System.out.println("TR: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }

    public void bottomLeft() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


                x--;
                y--;
                //System.out.println("BL: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }

    public void topLeft() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


                x--;
                y++;
                //System.out.println("TL: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }

    public void bottomRight() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


                x++;
                y--;
                //System.out.println("BR: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }



    public void bottom()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;

            y--;
            validMoves.add(x + "" + y);

        }
    }

    public void top()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


                y++;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }
    public void left()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


                x--;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }
    public void right()
    {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


                x++;
                //System.out.println("B: "+x+""+y);
                validMoves.add(x + "" + y);

        }
    }

}