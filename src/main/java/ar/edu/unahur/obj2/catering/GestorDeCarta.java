package ar.edu.unahur.obj2.catering;

import java.util.ArrayDeque;
import java.util.Deque;

import ar.edu.unahur.obj2.catering.excepciones.NadaParaRevertirException;

public class GestorDeCarta {

    private final Deque<Modificacion> historial;

    public GestorDeCarta(Deque<Modificacion> historial) {
        this.historial = new ArrayDeque<>();
    }

    public void aplicar(Modificacion modificacion){
        modificacion.ejecutar();
        historial.push(modificacion);
    }

    public void revertir(){
        if(historial.isEmpty()) {
            throw new NadaParaRevertirException();
        }
        
        Modificacion ultima = historial.pop();
        ultima.deshacer();
    }

    
    
}
