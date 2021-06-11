import Pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chess implements ActionListener {
    JFrame frame = new JFrame("Chess");

    Container pane = frame.getContentPane();
    JButton qu = new JButton();
    JButton bi = new JButton();
    JButton ki = new JButton();
    JButton kn = new JButton();
    JButton ro = new JButton();
    JButton pa = new JButton();


    JButton[][] board = new JButton[8][8];
    ImageIcon knight = new ImageIcon(getClass().getResource("Icons/blackKnight.png"));
    ImageIcon bishop = new ImageIcon(getClass().getResource("Icons/blackBishop.png"));
    ImageIcon rook = new ImageIcon(getClass().getResource("Icons/blackRook.png"));
    ImageIcon queen = new ImageIcon(getClass().getResource("Icons/blackQueen.png"));
    ImageIcon king = new ImageIcon(getClass().getResource("Icons/blackKing.png"));
    ImageIcon pawn = new ImageIcon(getClass().getResource("Icons/blackPawn.png"));

    Bishop bishopp = new Bishop();

    Rook rookk = new Rook();
    King kingg = new King();
    Knight knightt = new Knight();
    Pawn pawnn = new Pawn();


    public Chess() {
        int posx = 10;
        int posy = 50;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton e = new JButton();
                //assigning the button inside array board at index {i,j}
                board[i][j] = e;
                pane.add(e);
                e.setBounds(posx, posy, 100, 100);
                e.setName(i + "" + j);
                e.addActionListener(this);
                posx += 100;
                if ((i + j) % 2 != 0) {

                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
            posx = 10;
            posy += 100;
        }

        pane.setLayout(null);
        JButton d = new JButton();
        pane.add(d);
        d.setBounds(posx, 50, 100, 100);
        posx += 100;


        //queen outside button
        qu.setBounds(900, 100, 100, 100);
        qu.setIcon(queen);
        qu.addActionListener(this);
        pane.add(qu);
        qu.setName("00");
        //bishop outside button
        bi.setBounds(900, 200, 100, 100);
        bi.setIcon(bishop);
        bi.addActionListener(this);
        pane.add(bi);
        bi.setName("10");
        //king outside button
        ki.setBounds(900, 300, 100, 100);
        ki.setIcon(king);
        ki.addActionListener(this);
        pane.add(ki);
        ki.setName("20");
        //knight outside button
        kn.setBounds(900, 400, 100, 100);
        kn.setIcon(knight);
        kn.addActionListener(this);
        pane.add(kn);
        kn.setName("30");
        //rook outside button
        ro.setBounds(900, 500, 100, 100);
        ro.setIcon(rook);
        ro.addActionListener(this);
        pane.add(ro);
        ro.setName("40");
        //pawn outside button
        pa.setBounds(900, 600, 100, 100);
        pa.setIcon(pawn);
        pa.addActionListener(this);
        pane.add(pa);
        pa.setName("50");

        frame.setSize(900, 900);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        Chess chess = new Chess();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //event to string to get index
        String ev = e.toString();
        //clicked piece
        String activePiece = ev.substring(ev.length() - 2);
        //location of piece index
        int x = Integer.parseInt(activePiece.substring(0, 1));
        int y = Integer.parseInt(activePiece.substring(1, 2));

        /*if (activePiece.equals("10")) {
            clearBoard();

            bishopp.x_pos = x;
            bishopp.y_pos = y;
            for (String pos : bishopp.getValidMoves()) {
                //System.out.println(pos);
                int xx = Integer.parseInt(pos.substring(0, 1));

                int yy = Integer.parseInt(pos.substring(1, 2));
                System.out.println(xx + "" + yy);
                board[xx][yy].setBackground(Color.RED);
            }
        board[x][y].setIcon(bishop);*/
       // } else if (activePiece.equals("00")) {
        Queen queenn = new Queen();
            clearBoard();
            queenn.x_pos = x;
            queenn.y_pos = y;
            for (String pos : queenn.getValidMoves()) {
                //System.out.println(pos);
                int xx = Integer.parseInt(pos.substring(0, 1));

                int yy = Integer.parseInt(pos.substring(1, 2));
                System.out.println(xx + "" + yy);
                board[xx][yy].setBackground(Color.RED);
            }
            board[x][y].setIcon(queen);
        /*} else if (activePiece.equals("20")) {
            clearBoard();
            kingg.x_pos = x;
            kingg.y_pos = y;
            for (String pos : kingg.getValidMoves()) {
                //System.out.println(pos);
                int xx = Integer.parseInt(pos.substring(0, 1));

                int yy = Integer.parseInt(pos.substring(1, 2));
                System.out.println(xx + "" + yy);
                board[xx][yy].setBackground(Color.RED);
            }
            board[x][y].setIcon(king);
        } else if (activePiece.equals("30")) {
            clearBoard();
            knightt.x_pos = x;
            knightt.y_pos = y;
            for (String pos : knightt.getValidMoves()) {
                //System.out.println(pos);
                int xx = Integer.parseInt(pos.substring(0, 1));

                int yy = Integer.parseInt(pos.substring(1, 2));
                System.out.println(xx + "" + yy);
                board[xx][yy].setBackground(Color.RED);
            }
            board[x][y].setIcon(knight);
        } else if (activePiece.equals("40")) {
            clearBoard();
            rookk.x_pos = x;
            rookk.y_pos = y;
            for (String pos : rookk.getValidMoves()) {
                //System.out.println(pos);
                int xx = Integer.parseInt(pos.substring(0, 1));

                int yy = Integer.parseInt(pos.substring(1, 2));
                System.out.println(xx + "" + yy);
                board[xx][yy].setBackground(Color.RED);
            }
            board[x][y].setIcon(rook);
        } else if (activePiece.equals("pa")) {
            clearBoard();
            pawnn.x_pos = x;
            pawnn.y_pos = y;
            board[x][y].setIcon(bishop);
            for (String pos : pawnn.getValidMoves()) {
                //System.out.println(pos);
                int xx = Integer.parseInt(pos.substring(0, 1));

                int yy = Integer.parseInt(pos.substring(1, 2));
                System.out.println(xx + "" + yy);
                board[xx][yy].setBackground(Color.RED);
            }

        } else {
            System.out.println("No Button Clicked");
        }*/



/*



        if (activePiece.equals("bi")) {
            board[x][y].setIcon(knight);
            c.setIcon(null);
        }
        else if (index.equals("c")) {
            c.setIcon(knight);
            b.setIcon(null);
                   }

        //System.out.println(x + ""+ y);
        clearBoard();
        bishopp.x_pos = x;
        bishopp.y_pos = y;

        for (String pos:  bishopp.getValidMoves()) {
            //System.out.println(pos);
           int xx = Integer.parseInt(pos.substring(0, 1));

            int yy = Integer.parseInt(pos.substring(1, 2));
            System.out.println(xx + ""+yy);
            board[xx][yy].setBackground(Color.RED);
        }


        board[x][y].setIcon(bishop);
        if (index.equals("b")) {

            b.setIcon(knight);
            c.setIcon(null);
        } else if (index.equals("c")) {
            c.setIcon(knight);
            b.setIcon(null);
        }*/
    }

    //resseting board color or image
    public void clearBoard() {
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        board[i][j].setBackground(Color.white);
                    } else {
                        board[i][j].setBackground(Color.gray);
                    }
                } else {
                    if (j % 2 == 0) {
                        board[i][j].setBackground(Color.gray);
                    } else {
                        board[i][j].setBackground(Color.white);
                    }

                }
                board[i][j].setIcon(null);
            }

        }
    }
}
