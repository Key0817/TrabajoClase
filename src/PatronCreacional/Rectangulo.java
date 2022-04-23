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
public class Rectangulo extends Formas {
    public int ancho;
    public int altura;

    public Rectangulo() {
    }

    public Rectangulo(Rectangulo fijar) {
        super(fijar);
        if (fijar != null) {
            this.ancho = fijar.ancho;
            this.altura = fijar.altura;
        }
    }

    @Override
    public Formas clone() {
        return new Rectangulo(this);
    }

    @Override
    public boolean equals(Object objeto2) {
        if (!(objeto2 instanceof Rectangulo) || !super.equals(objeto2)) return false;
        Rectangulo formas2 = (Rectangulo) objeto2;
        return formas2.ancho == ancho && formas2.altura == altura;
    }
}
