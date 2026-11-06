package ar.edu.unahur.obj2.catering;

public class MozosAdicionales extends AdicionalDecorator{
    public MozosAdicionales(Propuesta propuesta){
        super(propuesta);
    }

    @Override
    public Double precio() {
        return propuesta.precio() + 18000.0;    }

    @Override
    protected String nombreAdicional() {
        return "Mozos adicionales";
    }
}
