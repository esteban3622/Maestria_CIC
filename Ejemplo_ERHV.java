// Importar las clases necesarias del paquete java.util y java.awt
import java.util.ArrayList;
import java.awt.*;

// Definir la clase principal Ejemplo_ERHV
public class Ejemplo_ERHV {
    // Método principal main
    public static void main(String arg[]) throws InterruptedException {
        // Imprimir mensaje indicando el inicio de main()
        System.out.println("Comienza main()...");
        
        // Crear un objeto de la clase Circulo_ERHV con valores específicos
        Circulo_ERHV c = new Circulo_ERHV(2.0, 2.0, 4.0);
        // Imprimir el radio del círculo creado
        System.out.println("Radio = " + c.r + " unidades.");
        // Imprimir las coordenadas del centro del círculo creado
        System.out.println("Centro = (" + c.x + "," + c.y + ") unidades.");
        
        // Crear dos objetos de la clase Circulo_ERHV
        Circulo_ERHV c1 = new Circulo_ERHV(1.0, 1.0, 2.0);
        Circulo_ERHV c2 = new Circulo_ERHV(0.0, 0.0, 3.0);
        
        // Encontrar el círculo con el radio más grande entre c1 y c2
        c = c1.elMayor(c2);
        // Imprimir el radio del círculo con el radio más grande
        System.out.println("El mayor radio es " + c.r + ".");
        
        // Crear un nuevo círculo con radio 0.0
        c = new Circulo_ERHV(); // c.r = 0.0;
        // Encontrar el círculo con el radio más grande entre c1 y c2 utilizando un método estático
        c = Circulo_ERHV.elMayor(c1, c2);
        // Imprimir el radio del círculo con el radio más grande
        System.out.println("El mayor radio es " + c.r + ".");
        
        // Crear una ventana con un título específico
        VentanaCerrable_ERHV ventana = new VentanaCerrable_ERHV("Ventana abierta al mundo...");
        // Crear un ArrayList para almacenar objetos gráficos
        ArrayList v = new ArrayList();
        
        // Crear dos objetos de la clase CirculoGrafico_ERHV con colores específicos
        CirculoGrafico_ERHV cg1 = new CirculoGrafico_ERHV(200, 200, 100, Color.red);
        CirculoGrafico_ERHV cg2 = new CirculoGrafico_ERHV(300, 200, 100, Color.blue);
        
        // Crear un objeto de la clase RectanguloGrafico_ERHV con un color específico
        RectanguloGrafico_ERHV rg = new RectanguloGrafico_ERHV(50, 50, 450, 350, Color.green);
        
        // Agregar los objetos gráficos al ArrayList
        v.add(cg1);
        v.add(cg2);
        v.add(rg);
        
        // Crear un panel de dibujo con los objetos gráficos del ArrayList
        PanelDibujo_ERHV mipanel = new PanelDibujo_ERHV(v);
        
        // Agregar el panel de dibujo a la ventana
        ventana.add(mipanel);
        
        // Establecer el tamaño de la ventana
        ventana.setSize(500, 400);
        
        // Hacer visible la ventana
        ventana.setVisible(true);
        
        // Imprimir mensaje indicando el fin de main()
        System.out.println("Termina main()...");
    } // fin de main()
} // fin de class Ejemplo1
