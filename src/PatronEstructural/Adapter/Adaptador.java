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
public class Adaptador extends AgujeroCircular {
    private Adaptador clavija;

     public Adaptador(ClavijaCuadrada clavija) {
        this.clavija = clavija;
    }
   

    @Override
    public double getRadio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((clavija.getAncho() / 2), 2) * 2));
        return resultado;
    }

    private int getAncho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}