package dominio;

public class Pina extends Fruit {
    private int posX;
    private int posY;

    /**
     * Constructor de la Pina
     */
    public Pina() {
        super("Pina", 150); 

    }

    /**
     * Retorna la posicion X de la Pina
     * @return
     */
    public int getPosX() {
        return posX;
    }   
    /**
     * Retorna la posicion Y de la Pina
     * @return
     */
    public int getPosY() {
        return posY;
    }

}
