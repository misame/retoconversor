package model;

import control.TipoDeTiempo;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;

public class Tiempo extends Conversor {

    public Tiempo(String convertidoDe, String convertidoA, double cantidadInicial) {
        super(convertidoDe, convertidoA, cantidadInicial);
    }

    public void tiempoResultado(){
        TipoDeTiempo tdt = new TipoDeTiempo();
        Map<String, DoubleUnaryOperator> map = tdt.cambioDeTiempo();
        double tiempo = map.get(getConvertidoDe()+getConvertidoA()).applyAsDouble(getCantidadInicial());
        DecimalFormatSymbols ds = new DecimalFormatSymbols();
        ds.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("###.#####",ds);
        String resultado = df.format(tiempo);
        setResultado(Double.parseDouble(resultado));
    }
}
