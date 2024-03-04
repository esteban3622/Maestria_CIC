// Importar las clases necesarias del paquete java.awt y java.util
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

// Definición de la clase PanelDibujo_ERHV que extiende de la clase Panel
public class PanelDibujo_ERHV extends Panel {
    // Variable miembro para almacenar objetos dibujables
    private ArrayList v;

    // Constructor que inicializa el panel con un flujo de diseño y una lista de objetos dibujables
    public PanelDibujo_ERHV(ArrayList va) {
        super(new FlowLayout());
        this.v = va;
    }

    // Redefinición del método paint() para dibujar los objetos en el panel
    public void paint(Graphics g) {
        // Declaración de variables locales
        Dibujable_ERHV dib;
        Iterator it;

        // Obtener un iterador para recorrer la lista de objetos dibujables
        it = v.iterator();
        // Iterar sobre la lista de objetos dibujables
        while (it.hasNext()) {
            // Obtener el siguiente objeto dibujable de la lista
            dib = (Dibujable_ERHV) it.next();
            // Llamar al método dibujar() del objeto para dibujarlo en el panel
            dib.dibujar(g);
        }
    }
} // Fin de la clase PanelDibujo_ERHV
