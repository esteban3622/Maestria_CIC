// Definición de la clase Circulo_ERHV que extiende de la clase Geometria_ERHV
public class Circulo_ERHV extends Geometria_ERHV {
    // Variable estática para contar el número total de círculos creados
    static int numCirculos = 0;
    // Constante para almacenar el valor de PI
    public static final double PI = 3.14159265358979323846;
    // Variables de instancia para las coordenadas x, y y el radio del círculo
    public double x, y, r;

    // Constructor que inicializa las coordenadas x, y y el radio r del círculo
    public Circulo_ERHV(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        // Incrementar el contador de círculos
        numCirculos++;
    }

    // Constructor que inicializa el radio del círculo y establece las coordenadas x
    // e y en 0.0
    public Circulo_ERHV(double r) {
        this(0.0, 0.0, r);
    }

    // Constructor que crea un círculo copiando otro círculo dado
    public Circulo_ERHV(Circulo_ERHV c) {
        this(c.x, c.y, c.r);
    }

    // Constructor que crea un círculo con coordenadas (0.0, 0.0) y radio 1.0
    public Circulo_ERHV() {
        this(0.0, 0.0, 1.0);
    }

    // Método para calcular el perímetro del círculo
    public double perimetro() {
        return 2.0 * PI * r;
    }

    // Método para calcular el área del círculo
    public double area() {
        return PI * r * r;
    }

    // Método de objeto para comparar círculos y devolver el que tiene el radio más
    // grande
    public Circulo_ERHV elMayor(Circulo_ERHV c) {
        if (this.r >= c.r)
            return this;
        else
            return c;
    }

    // Método de clase para comparar círculos y devolver el que tiene el radio más
    // grande
    public static Circulo_ERHV elMayor(Circulo_ERHV c, Circulo_ERHV d) {
        if (c.r >= d.r)
            return c;
        else
            return d;
    }
} // fin de la clase Circulo
