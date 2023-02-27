package control;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;


public class TipoDeTiempo {
    public Map cambioDeTiempo(){
        Map<String,DoubleUnaryOperator> cambioTiempo = new HashMap<>();
        //De segundos
        cambioTiempo.put("segundossegundos", (t)-> t );
        cambioTiempo.put("segundosminutos", (t)-> t / 60);
        cambioTiempo.put("segundoshoras", (t)-> t / 3600);
        cambioTiempo.put("segundosdias", (t)-> t / 86400);
        cambioTiempo.put("segundossemanas", (t)-> t / 604800);
        cambioTiempo.put("segundosmeses", (t)-> t / 2.628e+6);
        cambioTiempo.put("segundosaños", (t)-> t * 3.154e+7);
        //De minutos
        cambioTiempo.put("minutosminutos", (t)-> t );
        cambioTiempo.put("minutossegundos", (t)-> t * 60 );
        cambioTiempo.put("minutoshoras", (t)-> t / 60);
        cambioTiempo.put("minutosdias", (t)-> t / 1440);
        cambioTiempo.put("minutossemanas", (t)-> t / 10080);
        cambioTiempo.put("minutosmeses", (t)-> t / 43800);
        cambioTiempo.put("minutosaños", (t)-> t / 525600);
        //De horas
        cambioTiempo.put("horashoras", (t)-> t );
        cambioTiempo.put("horassegundos", (t)-> t * 3600);
        cambioTiempo.put("horasminutos", (t)-> t * 60);
        cambioTiempo.put("horasdias", (t)-> t / 24);
        cambioTiempo.put("horassemanas", (t)-> t / 168);
        cambioTiempo.put("horasmeses", (t)-> t / 730);
        cambioTiempo.put("horasaños", (t)-> t / 8760);
        //De dias
        cambioTiempo.put("diasdias", (t)-> t );
        cambioTiempo.put("diassegundos", (t)-> t * 86400);
        cambioTiempo.put("diasminutos", (t)-> t * 1440);
        cambioTiempo.put("diashoras", (t)-> t * 24);
        cambioTiempo.put("diassemanas", (t)-> t / 7);
        cambioTiempo.put("diasmeses", (t)-> t / 30.417);
        cambioTiempo.put("diasaños", (t)-> t / 365);
        //De semanas
        cambioTiempo.put("semanassemanas", (t)-> t );
        cambioTiempo.put("semanassegundos", (t)-> t * 604800);
        cambioTiempo.put("semanasminutos", (t)-> t * 10080);
        cambioTiempo.put("semanashoras", (t)-> t * 168);
        cambioTiempo.put("semanasdias", (t)-> t * 7);
        cambioTiempo.put("semanasmeses", (t)-> t / 4.345);
        cambioTiempo.put("semanasaños", (t)-> t / 52.143);
        //De meses
        cambioTiempo.put("mesesmeses", (t)-> t );
        cambioTiempo.put("mesessegundos", (t)-> t * 2.628e+6);
        cambioTiempo.put("mesesminutos", (t)-> t * 43800);
        cambioTiempo.put("meseshoras", (t)-> t * 730);
        cambioTiempo.put("mesesdias", (t)-> t * 30.417);
        cambioTiempo.put("mesessemanas", (t)-> t * 4.345);
        cambioTiempo.put("mesesaños", (t)-> t / 12);
        //De años
        cambioTiempo.put("añosaños", (t)-> t );
        cambioTiempo.put("añossegundos", (t)-> t * 3.154e+7);
        cambioTiempo.put("añosminutos", (t)-> t * 525600);
        cambioTiempo.put("añoshoras", (t)-> t * 8760);
        cambioTiempo.put("añosdias", (t)-> t * 365);
        cambioTiempo.put("añossemanas", (t)-> t * 52.143);
        cambioTiempo.put("añosmeses", (t)-> t * 12);
        
        return cambioTiempo;
    }
}
