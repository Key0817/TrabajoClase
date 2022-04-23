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
public class Main {
    public static void main(String[] args) {
        AgujeroCircular agujero = new AgujeroCircular(5);
        ClavijaRedonda cr = new ClavijaRedonda(5);
        if (agujero.fits(cr)) {
            System.out.println("La clavija redonda r5 encaja en el orificio redondo r5.");
        }

        ClavijaCuadrada pcc = new ClavijaCuadrada(2);
        ClavijaCuadrada gcc = new ClavijaCuadrada(20);

        Adaptador pcca = new Adaptador(pcc);
        Adaptador gcca = new Adaptador(gcc);
        if (agujero.fits(pcca)) {
            System.out.println("La clavija cuadrada w2 encaja en el orificio redondo r5.");
        }
        if (!agujero.fits(gcca)) {
            System.out.println("La clavija cuadrada w20 no encaja en el orificio redondo r5.");
        }
    }
}
