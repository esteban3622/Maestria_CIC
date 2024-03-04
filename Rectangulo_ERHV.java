// Definición de la clase Rectangulo_ERHV que extiende de la clase Geometria_ERHV
public class Rectangulo_ERHV extends Geometria_ERHV {
    // Variable estática para contar el número total de rectángulos creados
    private static int numRectangulos = 0;
    // Variables miembro para las coordenadas de los puntos del rectángulo
    protected double x1, y1, x2, y2;

    // Constructor que inicializa las coordenadas de los puntos del rectángulo
    public Rectangulo_ERHV(double p1x, double p1y, double p2x, double p2y) {
        x1 = p1x;
        x2 = p2x;
        y1 = p1y;
        y2 = p2y;
        // Incrementar el contador de rectángulos
        numRectangulos++;
    }

    // Constructor que crea un rectángulo con coordenadas predeterminadas
    public Rectangulo_ERHV() {
        this(0, 0, 1.0, 1.0);
    }

    // Método para calcular el perímetro del rectángulo
    public double perimetro() {
        return 2.0 * ((x1 - x2) + (y1 - y2));
    }

    // Método para calcular el área del rectángulo
    public double area() {
        return (x1 - x2) * (y1 - y2);
    }
} // fin de la clase Rectangulo_ERHV
