/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import control.TipoDeTemperatura;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author miguel
 */
public class Temperatura extends Conversor{

    public Temperatura(String convertidoDe, String convertidoA, double cantidadInicial) {
        super( convertidoDe,  convertidoA,  cantidadInicial);
    }

    
    
    public void temperaturaResultado(){
        TipoDeTemperatura tdt = new TipoDeTemperatura();
        Map<String,DoubleUnaryOperator> ct = new HashMap<>();
        ct = tdt.cambioDeTemperatura();
        double temperatura = ct.get(getConvertidoDe()+getConvertidoA()).applyAsDouble(getCantidadInicial());
        DecimalFormatSymbols ds = new DecimalFormatSymbols();
        ds.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("###.##",ds);
        String resultado = df.format(temperatura);
        setResultado(Double.parseDouble(resultado));
    }



    
    
}
