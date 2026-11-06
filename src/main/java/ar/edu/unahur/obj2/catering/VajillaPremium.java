package ar.edu.unahur.obj2.catering;

public class VajillaPremium extends AdicionalDecorator{

    public VajillaPremium(Propuesta propuesta){
        super(propuesta);
    }

    @Override
    public Double precio() {
        return propuesta.precio() + 12000.0;
    }

    @Override
    protected String nombreAdicional() {
        return "Vajilla premium";
    }

    
}
