package ar.edu.unahur.obj2.catering.excepciones;

public class NadaParaRevertirException extends RuntimeException{

    public NadaParaRevertirException(){
        super("No hay modificaciones parar revertir");
    }
}
