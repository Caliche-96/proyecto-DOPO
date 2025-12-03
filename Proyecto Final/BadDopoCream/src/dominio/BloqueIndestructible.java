package dominio;

import javax.swing.*;

public class BloqueIndestructible implements Bloque {

    private int row;
    private int col;
    private ImageIcon sprite;

    public BloqueIndestructible(int row, int col) {
        this.row = row;
        this.col = col;
        this.sprite = new ImageIcon("recursos/Bloque.png");
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public ImageIcon getSprite() {
        return sprite;
    }
}
