/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_mundialciclismo;

import controlador.ControladorMundial;
import vista.Vista;


public class Proyecto1_MundialCiclismo {

    public static void main(String[] args) {
        ControladorMundial controlador = new ControladorMundial();
        Vista vista = new Vista(controlador);
        vista.iniciar();
    }
}
