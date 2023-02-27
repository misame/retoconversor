package control;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author miguel
 */
public class TipoDeTemperatura {

    public TipoDeTemperatura() {

    }


    public Map cambioDeTemperatura() {
        Map<String, DoubleUnaryOperator> cambioTemperatura = new HashMap<>();
        //De Celsius
        cambioTemperatura.put("CelciusCelcius", (t) -> t);
        cambioTemperatura.put("CelciusFahrenheit", (t) -> (t * 1.8) + 32);
        cambioTemperatura.put("CelciusKelvin", (t) -> t + 273.15);
        //De Fahrenheit
        cambioTemperatura.put("FahrenheitFahrenheit", (t) -> t);
        cambioTemperatura.put("FahrenheitCelcius", (t) -> (t - 32) / 1.8);
        cambioTemperatura.put("FahrenheitKelvin", (t) -> 1.8 * (t - 32) + 273.15);
        //Kelvin
        cambioTemperatura.put("KelvinKelvin", (t) -> t);
        cambioTemperatura.put("KelvinCelcius", (t) -> t - 273.15);
        cambioTemperatura.put("KelvinFahrenheit", (t) -> 1.8 * (t - 273.15) + 32);

        return cambioTemperatura;
    }


}
