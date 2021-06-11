package Pieces;

import java.util.ArrayList;

public class Knight {

    private String name = "B";

    public int x_pos = -1;
    public int y_pos = -1;

    ArrayList<String> validMoves = new ArrayList<String>();

    public void move() {

    }

    public ArrayList<String> getValidMoves() {
        validMoves.clear();
        topRight1();
        topRight2();
        bottomLeft1();
        bottomLeft2();
        topLeft1();
        topLeft2();
        bottomRight1();
        bottomRight2();

        return validMoves;
    }

    public void topRight1() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x += 2;
            y += 1;
            //System.out.println("TR: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }

    public void topRight2() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x += 1;
            x += 2;
            //System.out.println("TR: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }

    public void bottomLeft1() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x -= 2;
            y -= 1;
            //System.out.println("BL: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }

    public void bottomLeft2() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x -= 1;
            y -= 2;
            //System.out.println("BL: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }


    public void topLeft1() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x -= 2;
            y += 1;
            //System.out.println("TL: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }

    public void topLeft2() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x -= 1;
            y += 2;
            //System.out.println("TL: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }

    public void bottomRight1() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x += 2;
            y -= 1;
            //System.out.println("BR: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }

    public void bottomRight2() {
        if ((x_pos != -1) && (y_pos != -1)) {

            int x = x_pos;
            int y = y_pos;


            x += 1;
            y -= 2;
            //System.out.println("BR: "+x+""+y);
            validMoves.add(x + "" + y);

        }
    }
}
