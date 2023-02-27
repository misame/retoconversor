package model;

import control.TipoDeMoneda;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author miguel
 */
public class Moneda extends Conversor {   

    public Moneda(String convertidoDe, String convertidoA, double monto) {
        super(convertidoDe, convertidoA, monto);
    }
    
    
    public void cambioDeMoneda(){
        TipoDeMoneda tm = new TipoDeMoneda();
        Map<String,DoubleUnaryOperator> map = tm.cambioDeMoneda();
        setResultado(map.get(this.getConvertidoDe()+this.getConvertidoA()).applyAsDouble(this.getCantidadInicial()));
    } 

}
