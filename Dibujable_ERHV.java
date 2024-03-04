// Definición de la interfaz Dibujable_ERHV
import java.awt.Graphics;

public interface Dibujable_ERHV {
    // Método para establecer la posición de un objeto dibujable en un plano
    public void setPosicion(double x, double y);

    // Método para dibujar un objeto en un área gráfica
    public void dibujar(Graphics dw);
}
