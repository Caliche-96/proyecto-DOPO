package dominio;

// Representa a cualquier entidad móvil en el tablero (Helados o Enemigos)
public abstract class Entity {
    protected int x;
    protected int y;
    protected Direction currentDirection; // Enum (Norte, Sur, Este, Oeste)

    public abstract void move();
    
    // Métodos para cambiar dirección
    public enum Direction {
        NORTH, SOUTH, EAST, WEST
    }
}