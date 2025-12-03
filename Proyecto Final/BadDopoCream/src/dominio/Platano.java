package dominio;

import javax.swing.*;

public class Platano {

    private int row;
    private int col;
    private ImageIcon sprite;

    public Platano(int row, int col) {
        this.row = row;
        this.col = col;
        this.sprite = new ImageIcon("recursos/banana.png");
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public ImageIcon getSprite() { return sprite; }
}
