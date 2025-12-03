package dominio;

public class BadDopoCream {
    private Player player;
    private Board board;
    private int level;
    private Machine maquina;
    public BadDopoCream(Player player, Board board) {
        this.player = player;
        this.board = board;
    }

    public void startGame() {
        // Lógica para iniciar el juego, configurar el tablero, etc.
    }

    public void updateGame() {
        board.update();
        // Lógica adicional para actualizar el estado del juego
    }


    
}
