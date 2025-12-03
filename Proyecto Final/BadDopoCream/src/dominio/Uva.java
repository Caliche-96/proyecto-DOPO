package dominio;

public class Uva extends Fruit {
    private int posX;
    private int posY;

    /**
     * Constructor de la Uva
     */
    public Uva() {
        super("Uva", 50); 

    }

    /**
     * Retorna la posicion X de la Uva
     * @return
     */
    public int getPosX() {
        return posX;
    }


    /**
     * Retorna la posicion Y de la Uva
     * @return
     */
    public int getPosY() {
        return posY;
    }

}
