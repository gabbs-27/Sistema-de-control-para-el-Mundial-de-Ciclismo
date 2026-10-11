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
   
   
public String actualizarRanking(int numero, int puntos, boolean ganoMedalla) {
        Competidor corredor = obtenerCorredor(numero);
        if (corredor == null) {
            return "Primero registre el corredor " + numero;
        }
        if (ganoMedalla) {
            corredor.actualizarRanking(puntos, true);  
        } else {
            corredor.actualizarRanking(puntos);       
        }
        return "Ranking del corredor " + numero + " actualizado:\n" + corredor.obtenerDatos();
    }

 public String verRanking() {
        if (corredor1 == null || corredor2 == null) {
            return "Debe registrar los 2 corredores.";
        }
        String texto = "- RANKING - \n";
        if (corredor1.getRankingMundial() <= corredor2.getRankingMundial()) {
            texto = texto + "1° " + corredor1.obtenerDatos() + "\n";
            texto = texto + "2° " + corredor2.obtenerDatos() + "\n";
        } else {
            texto = texto + "1° " + corredor2.obtenerDatos() + "\n";
            texto = texto + "2° " + corredor1.obtenerDatos() + "\n";
        }
        return texto;
    }
 
 

}