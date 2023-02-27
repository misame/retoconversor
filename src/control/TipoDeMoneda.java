
package control;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author miguel
 */
public class TipoDeMoneda {
    
        public Map cambioDeMoneda() {
        Map<String, DoubleUnaryOperator> cambio = new HashMap<>();
        //De sol A:
        cambio.put("SolSol", (t)-> t );
        cambio.put("SolDolar USD", (t)-> t * 0.26);
        cambio.put("SolEuro",(t)->  0.24);
        cambio.put("SolLibras Esterlinas",(t)-> t * 0.22);
        cambio.put("SolYen Japones",(t)-> t * 35.80);
        cambio.put("SolWon surcoreano",(t)-> t * 344.87);
        //De dolar A:
        cambio.put("Dolar USDDolar USD",(t)-> t );
        cambio.put("Dolar USDSol",(t)-> t * 3.81);
        cambio.put("DolarEuro",(t)-> t * 0.94);
        cambio.put("DolarLibras Esterlinas",(t)-> t * 0.84);
        cambio.put("DolarYen Japones",(t)-> t * 35.80);
        cambio.put("DolarWon surcoreano",(t)-> t * 1314.80);
        //De Euro A:
        cambio.put("EuroEuro",(t)-> t );
        cambio.put("EuroSol",(t)-> t * 4.07);
        cambio.put("EuroDolar USD",(t)-> t * 1.05);
        cambio.put("EuroLibras Esterlinas",(t)-> t * 0.88);
        cambio.put("EuroYen Japones",(t)-> t * 143.99);
        cambio.put("EuroWon surcoreano",(t)-> t * 1388.83);
        //De Libras Esterlinas A:
        cambio.put("Libras EsterlinasLibras Esterlinas",(t)-> t );
        cambio.put("Libras EsterlinasSol",(t)-> t * 4.55);
        cambio.put("Libras EsterlinasDolar USD",(t)-> t * 1.19);
        cambio.put("Libras EsterlinasYen Japones",(t)-> t * 163.02);
        cambio.put("Libras EsterlinasEuro",(t)-> t * 1.13);
        cambio.put("Libras EsterlinasWon surcoreano",(t)-> t * 1570.53);
        //De Yen A:
        cambio.put("Yen JaponesYen Japones",(t)-> t );
        cambio.put("Yen JaponesSol",(t)-> t * 0.028);
        cambio.put("Yen JaponesLibras Esterlinas",(t)-> t * 0.0061);
        cambio.put("Yen JaponesDolar USD",(t)-> t * 0.0073);
        cambio.put("Yen JaponesEuro",(t)-> t * 0.0069);
        cambio.put("Yen JaponesWon surcoreano",(t)-> t * 9.65);
        //De Won A:
        cambio.put("Won surcoreanoWon surcoreano",(t)-> t );
        cambio.put("Won surcoreanoSol",(t)-> t * 0.0029);
        cambio.put("Won surcoreanoLibras Esterlinas",(t)-> t * 0.00064);
        cambio.put("Won surcoreanoDolar USD",(t)-> t * 0.00076);
        cambio.put("Won surcoreanoEuro",(t)-> t * 0.00072);
        cambio.put("Won surcoreanoYen Japones",(t)-> t * 0.10);
        
        return cambio;      

    }
}
