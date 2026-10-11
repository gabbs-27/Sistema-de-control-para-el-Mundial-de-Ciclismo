/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author gabby
 */

import modelo.Competidor;

public class ControladorMundial {

    private Competidor corredor1;
    private Competidor corredor2;

    public ControladorMundial() {
        corredor1 = null;     
        corredor2 = null;
    }
   
    public Competidor obtenerCorredor(int numero) {
        if (numero == 1) {
            return corredor1;
        } else {
            return corredor2;
        }
    }
    
   public String registrarCorredor(int numero, String nombre, int edad, String pais,
                                    int ranking, double estatura, double peso) {
        Competidor corredor = new Competidor(nombre, edad, pais, ranking, estatura, peso);
        if (numero == 1) {
            corredor1 = corredor;
        } else {
            corredor2 = corredor;
        }
        return "Corredor " + numero + " registrado:\n" + corredor.obtenerDatos();
    }
}