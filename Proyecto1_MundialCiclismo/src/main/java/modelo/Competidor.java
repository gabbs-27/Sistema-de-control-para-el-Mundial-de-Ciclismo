/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabby
 */
public class Competidor extends Atleta {

    private int rankingMundial;
    private double estatura;
    private double peso;
    private int puntos;

    public Competidor(String nombre, int edad, String pais,
                      int rankingMundial, double estatura, double peso) {
        super(nombre, edad, pais);
        this.rankingMundial = rankingMundial;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = 0;
        
        
    }

    public int getRankingMundial() {
        return rankingMundial;
    }

    public void setRankingMundial(int rankingMundial) {
        this.rankingMundial = rankingMundial;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
   
    @Override
    public String toString() {
        return super.toString() + "Ranking mundial: " + rankingMundial + "Estatura: " + estatura + " m" + "Peso: " + peso + " kg" + "Puntos: " + puntos;
    }
    
        public String obtenerDatos() {
        return toString();
    }
        
       public void actualizarRanking(int puntosObtenidos) {
        if (puntosObtenidos >= 0) {
            puntos = puntos + puntosObtenidos;
            int posicionesQueSube = puntosObtenidos / 10;
            rankingMundial = rankingMundial - posicionesQueSube;
            if (rankingMundial < 1) {
                rankingMundial = 1;
            }
        
        }
       }
       
        
        public void actualizarRanking(int puntosObtenidos, boolean ganoMedalla) {
        int bono = 0;
        if (ganoMedalla) {
            if (puntosObtenidos >= 50) {
                bono = 20;
            } else {
                bono = 10;
            }
        }
        
        actualizarRanking(puntosObtenidos + bono);
    }
        }
        
        
        
        
        
        
    
        
        
        
        
    
