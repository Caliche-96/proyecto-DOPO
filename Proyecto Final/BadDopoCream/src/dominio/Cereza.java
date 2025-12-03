package dominio;

public class Cereza extends Fruit {
    private int posX;
    private int posY;

    /**
     * Constructor de la Cereza
     */
    public Cereza() {
        super("Cereza", 150); 

    }

    /**
     * Retorna la posicion X de la Cereza
     * @return
     */
    public int getPosX() {
        return posX;
    }   
    /**
     * Retorna la posicion Y de la Cereza
     * @return
     */
    public int getPosY() {
        return posY;
    }

    @Override
    public void update(long deltaTime) {
        // Se va a actualizar la posicion de la cereza cada 20 segundos a una posicion aleatoria dentro del tablero
        

    }

}
