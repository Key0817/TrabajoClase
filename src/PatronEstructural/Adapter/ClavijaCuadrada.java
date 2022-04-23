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
public class ClavijaCuadrada {
    private double ancho;

    public ClavijaCuadrada(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double getCuadrada() {
        double resultado;
        resultado = Math.pow(this.ancho, 2);
        return resultado;
    }
}