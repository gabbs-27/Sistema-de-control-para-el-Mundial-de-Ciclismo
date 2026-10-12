/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author gabby
 */
import javax.swing.JOptionPane;
import controlador.ControladorMundial;

public class Vista {

    private ControladorMundial controlador;

    public Vista(ControladorMundial controlador) {
        this.controlador = controlador;
    }

    public String leerTexto(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    }

    public int leerEntero(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        int numero = Integer.parseInt(dato);
        return numero;
    }

    public double leerDouble(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        double numero = Double.parseDouble(dato);
        return numero;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
