/**
 * Se realizará una clase para identificar los enemigos del juego
 * 
 * @author Carlos Duban Rojas & Eduardo Rico
 * @version 1.0
 * 
 */

package dominio;

// Clase base para todos los enemigos [cite: 45]
public abstract class Enemy extends Entity {
    // Los enemigos eliminan al jugador si lo tocan [cite: 46]
    // No recolectan frutas y pueden pasar sobre ellas [cite: 46]

    @Override
    public abstract void move(); // Cada enemigo tiene su propio patrón de movimiento
}
