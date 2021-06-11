import Pieces.Knight;
import Pieces.Piece;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;

/*public class GridLayoutManager extends JFrame {

    private Container contents;

    private JButton[][] squares = new JButton[8][8];

    private Color colorBlack = Color.LIGHT_GRAY;

    private int row = 7;
    private int col = 7;
    Knight knightt = new Knight(7,7);

    private ImageIcon knight = new ImageIcon(getClass().getResource("Icons/blackKnight.png"));
    private ImageIcon bishop = new ImageIcon(getClass().getResource("Icons/blackBishop.png"));
    private ImageIcon rook = new ImageIcon(getClass().getResource("Icons/blackRook.png"));
    private ImageIcon queen = new ImageIcon(getClass().getResource("Icons/blackQueen.png"));
    private ImageIcon king = new ImageIcon(getClass().getResource("Icons/blackKing.png"));
    private ImageIcon pawn = new ImageIcon(getClass().getResource("Icons/blackPawn.png"));

    public GridLayoutManager()
    {
        super("Chess");

        contents =  getContentPane();
        contents.setLayout(new GridLayout(8,8));

        ButtonHandler buttonHandler = new ButtonHandler();

        for (int i=0; i<8;i++)
        {
            for(int j=0; j<8; j++)
            {
                squares[i][j] = new JButton();
                if((i+j)%2 !=0)
                {
                    squares[i][j].setBackground(colorBlack);
                }
                contents.add(squares[i][j]);
                squares[i][j].addActionListener(buttonHandler);
            }
        }
        squares[knightt.x][knightt.y].setIcon(knight);
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void processClick(int i, int j)
    {
        if(knightt.isValidPath(i,j) ==  true)
        {
            squares[row][col].setIcon(null);
            squares[i][j].setIcon(knight);
            row = i;
            col = j;
        }
        return;
    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            for(int i=0; i<8; i++)
            {
                for(int j=0; j<0; j++)
                {
                    if(source == squares[i][j])
                    {
                        processClick(i, j);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        GridLayoutManager gui = new GridLayoutManager();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
*/