// Importar las clases necesarias del paquete java.awt y java.awt.event
import java.awt.*;
import java.awt.event.*;

// Definición de la clase VentanaCerrable_ERHV que extiende de la clase Frame e implementa la interfaz WindowListener
public class VentanaCerrable_ERHV extends Frame implements WindowListener {
    // Constructores

    // Constructor predeterminado
    public VentanaCerrable_ERHV() {
        super();
    }

    // Constructor que acepta un título para la ventana
    public VentanaCerrable_ERHV(String title) {
        super(title);
        setSize(500, 500); // Establecer el tamaño predeterminado de la ventana
        addWindowListener(this); // Agregar el listener de eventos de ventana a la ventana actual
    }

    // Métodos de la interfaz WindowListener

    // Método llamado cuando la ventana se activa
    public void windowActivated(WindowEvent e) {
        // No se realiza ninguna acción
    }

    // Método llamado cuando la ventana se cierra
    public void windowClosed(WindowEvent e) {
        // No se realiza ninguna acción
    }

    // Método llamado cuando se está cerrando la ventana
    public void windowClosing(WindowEvent e) {
        System.exit(0); // Salir de la aplicación cuando se cierra la ventana
    }

    // Método llamado cuando la ventana se desactiva
    public void windowDeactivated(WindowEvent e) {
        // No se realiza ninguna acción
    }

    // Método llamado cuando la ventana se restaura desde un estado minimizado
    public void windowDeiconified(WindowEvent e) {
        // No se realiza ninguna acción
    }

    // Método llamado cuando la ventana se minimiza
    public void windowIconified(WindowEvent e) {
        // No se realiza ninguna acción
    }

    // Método llamado cuando la ventana se abre
    public void windowOpened(WindowEvent e) {
        // No se realiza ninguna acción
    }
} // Fin de la clase VentanaCerrable_ERHV
