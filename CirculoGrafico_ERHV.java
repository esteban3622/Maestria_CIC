// Importar las clases necesarias del paquete java.awt
import java.awt.Graphics;
import java.awt.Color;

// Definición de la clase CirculoGrafico_ERHV que hereda de la clase Circulo_ERHV e implementa la interfaz Dibujable_ERHV
public class CirculoGrafico_ERHV extends Circulo_ERHV implements Dibujable_ERHV {
    // Variable para almacenar el color del círculo
    Color color;

    // Constructor que inicializa las coordenadas x, y y el radio r del círculo, y asigna un color específico
    public CirculoGrafico_ERHV(double x, double y, double r, Color unColor) {
        // Llamada al constructor de la clase base Circulo_ERHV
        super(x, y, r);
        this.color = unColor;
    }

    // Implementación del método dibujar de la interfaz Dibujable_ERHV
    public void dibujar(Graphics dw) {
        // Establecer el color del gráfico
        dw.setColor(color);
        // Dibujar el círculo en el área de dibujo
        dw.drawOval((int) (x - r), (int) (y - r), (int) (2 * r), (int) (2 * r));
    }

    // Método para establecer la posición del círculo (no implementado en este caso)
    public void setPosicion(double x, double y) {
        // No se implementa en este caso
    }
} // fin de la clase CirculoGrafico_ERHV
