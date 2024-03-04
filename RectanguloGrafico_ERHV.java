// Importar las clases necesarias del paquete java.awt
import java.awt.Graphics;
import java.awt.Color;

// Definición de la clase RectanguloGrafico_ERHV que extiende de la clase Rectangulo_ERHV e implementa la interfaz Dibujable_ERHV
public class RectanguloGrafico_ERHV extends Rectangulo_ERHV implements Dibujable_ERHV {
    // Nueva variable miembro para almacenar el color del rectángulo
    Color color;

    // Constructor que inicializa las coordenadas de los puntos del rectángulo y asigna un color específico
    public RectanguloGrafico_ERHV(double x1, double y1, double x2, double y2, Color unColor) {
        // Llamada al constructor de la clase base Rectangulo_ERHV
        super(x1, y1, x2, y2);
        this.color = unColor; // En este caso, 'this' es opcional
    }

    // Implementación del método dibujar de la interfaz Dibujable_ERHV
    public void dibujar(Graphics dw) {
        // Establecer el color del gráfico
        dw.setColor(color);
        // Dibujar el rectángulo en el área de dibujo
        dw.drawRect((int) x1, (int) y1, (int) (x2 - x1), (int) (y2 - y1));
    }

    // Método para establecer la posición del rectángulo (no implementado en este caso)
    public void setPosicion(double x, double y) {
        // Método vacío, pero necesario de definir
    }
} // fin de la clase RectanguloGrafico_ERHV
