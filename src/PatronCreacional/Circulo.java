/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronCreacional;

/**
 *
 * @author Keylor P
 */
public class Circulo extends Formas {
    public int radio;

    public Circulo() {
    }

    public Circulo(Circulo fijar) {
        super(fijar);
        if (fijar != null) {
            this.radio = fijar.radio;
        }
    }

    @Override
    public Formas clone() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object objeto2) {
        if (!(objeto2 instanceof Circulo) || !super.equals(objeto2)) return false;
        Circulo formas2 = (Circulo) objeto2;
        return formas2.radio == radio;
    }
}
