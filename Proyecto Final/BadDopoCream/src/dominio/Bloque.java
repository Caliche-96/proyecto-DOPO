package dominio;

import javax.swing.ImageIcon;

/**
 * Interfaz base para todos los bloques del tablero.
 * Define los métodos que las implementaciones deben proveer.
 */
public interface Bloque {

    /**
     * Fila (row) del bloque en la cuadrícula (coordenada en celdas).
     */
    int getRow();

    /**
     * Columna (col) del bloque en la cuadrícula (coordenada en celdas).
     */
    int getCol();

    /**
     * Sprite del bloque como ImageIcon .
     */
    ImageIcon getSprite();

    /**
     * Indica si el bloque puede ser destruido por el jugador.
     */
    //boolean esDestructible();
}
