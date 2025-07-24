import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.FormPersona;

public class Main {
    public static void main(String[] args) {
        // Establecer look and feel del sistema operativo
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException |
                 InstantiationException |
                 IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            System.err.println("No se pudo establecer el Look and Feel: " + e.getMessage());
        }

        // Ejecutar la interfaz principal en el hilo de eventos de Swing
        javax.swing.SwingUtilities.invokeLater(() -> {
            new FormPersona().setVisible(true);  // Cambia aquí si tienes múltiples formularios
        });
    }
}
