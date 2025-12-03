package presentacion;

import dominio.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Level1GUI extends JFrame implements KeyListener {

    private GameBoard board;
    private Player player;
    private Troll troll;

    private BoardPanel boardPanel;
    private ArrayList<Platano> bananas;

    public static final int CELL_SIZE = 32;

    public Level1GUI() {
        setTitle("Nivel 1");
        setSize(GameBoard.COLS * CELL_SIZE + 15, GameBoard.ROWS * CELL_SIZE + 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addKeyListener(this);

        board = new GameBoard();

        player = new Player(2, 2);
        troll = new Troll(3, 3);

        bananas = new ArrayList<>();
        generarBananasAleatorias();

        boardPanel = new BoardPanel();
        add(boardPanel);

        setVisible(true);
    }

    private void generarBananasAleatorias() {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int row, col;

            do {
                row = 1 + rand.nextInt(GameBoard.ROWS - 2);
                col = 1 + rand.nextInt(GameBoard.COLS - 2);
            } while (
                    !board.isCellFree(row, col) ||
                    (row == player.getRow() && col == player.getCol()) ||
                    (row == troll.getRow() && col == troll.getCol())
            );

            bananas.add(new Platano(row, col));
        }
    }

    private class BoardPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // FONDO CUADRICULA
            for (int row = 0; row < GameBoard.ROWS; row++) {
                for (int col = 0; col < GameBoard.COLS; col++) {
                    g.setColor(Color.LIGHT_GRAY);
                    g.drawRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                }
            }

            // BLOQUES INDESTRUCTIBLES
            for (int r = 0; r < GameBoard.ROWS; r++) {
                for (int c = 0; c < GameBoard.COLS; c++) {
                    Object obj = board.getAt(r, c);

                    if (obj instanceof BloqueIndestructible block) {
                        g.drawImage(
                            block.getSprite().getImage(),
                            c * CELL_SIZE,
                            r * CELL_SIZE,
                            CELL_SIZE,
                            CELL_SIZE,
                            this
                        );
                    }
                }
            }

            // BANANAS
            for (Platano b : bananas) {
                g.drawImage(
                    b.getSprite().getImage(),
                    b.getCol() * CELL_SIZE,
                    b.getRow() * CELL_SIZE,
                    CELL_SIZE, CELL_SIZE, this
                );
            }

            // PLAYER
            g.drawImage(
                player.getSprite().getImage(),
                player.getCol() * CELL_SIZE,
                player.getRow() * CELL_SIZE,
                CELL_SIZE, CELL_SIZE, this
            );

            // TROLL
            g.drawImage(
                troll.getSprite().getImage(),
                troll.getCol() * CELL_SIZE,
                troll.getRow() * CELL_SIZE,
                CELL_SIZE, CELL_SIZE, this
            );
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        // PLAYER
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> player.moveUp(board);
            case KeyEvent.VK_DOWN -> player.moveDown(board);
            case KeyEvent.VK_LEFT -> player.moveLeft(board);
            case KeyEvent.VK_RIGHT -> player.moveRight(board, GameBoard.COLS);
        }

        // TROLL
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> troll.moveUp(board);
            case KeyEvent.VK_S -> troll.moveDown(board);
            case KeyEvent.VK_A -> troll.moveLeft(board);
            case KeyEvent.VK_D -> troll.moveRight(board);
        }

        boardPanel.repaint();
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
}
