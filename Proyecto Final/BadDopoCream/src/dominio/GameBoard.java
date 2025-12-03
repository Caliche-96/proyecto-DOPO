package dominio;

public class GameBoard {

    public static final int ROWS = 18;
    public static final int COLS = 18;

    private Object[][] grid;

    public GameBoard() {
        grid = new Object[ROWS][COLS];
        generarBorde();
    }

    public Object getAt(int row, int col) {
        return grid[row][col];
    }

    public void setAt(int row, int col, Object obj) {
        grid[row][col] = obj;
    }

    private void generarBorde() {
        for (int i = 0; i < ROWS; i++) {
            grid[0][i] = new BloqueIndestructible(0, i);
            grid[ROWS - 1][i] = new BloqueIndestructible(ROWS - 1, i);

            grid[i][0] = new BloqueIndestructible(i, 0);
            grid[i][COLS - 1] = new BloqueIndestructible(i, COLS - 1);
        }
    }

    public boolean isCellFree(int row, int col) {
        return grid[row][col] == null;
    }
}
