/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miguel
 */
public class Conversor {

    private double cantidadInicial;
    //private double conversion;
    private String convertidoDe;
    private String convertidoA;
    //protected String conversion;
    private double resultado;

    public Conversor() {

    }

    public Conversor(String convertidoDe, String convertidoA, double cantidadInicial) {
        this.convertidoDe = convertidoDe;
        this.convertidoA = convertidoA;
        this.cantidadInicial = cantidadInicial;
    }
    
    
    public double getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(double cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }
/**
    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }
**/
    public String getConvertidoDe() {
        return convertidoDe;
    }

    public void setConvertidoDe(String convertidoDe) {
        this.convertidoDe = convertidoDe;
    }

    public String getConvertidoA() {
        return convertidoA;
    }

    public void setConvertidoA(String convertidoA) {
        this.convertidoA = convertidoA;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
