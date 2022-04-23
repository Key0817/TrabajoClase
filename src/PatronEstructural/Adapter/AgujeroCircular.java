/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstructural.Adapter;

/**
 *
 * @author Keylor P
 */
public class AgujeroCircular {
    private double radio;

    public AgujeroCircular(double radio) {
        this.radio = radio;
    }

    AgujeroCircular(int i) {
        throw new UnsupportedOperationException("Aún no es compatible."); 
    }

    public double getRadio() {
        return radio;
    }

    public boolean fits(AgujeroCircular clavija) {
        boolean resultado;
        resultado = (this.getRadio() >= clavija.getRadio());
        return resultado;
    }

    boolean fits(ClavijaRedonda cr) {
        throw new UnsupportedOperationException("Aún no es compatible"); //To change body of generated methods, choose Tools | Templates.
    }
}