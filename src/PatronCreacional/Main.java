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
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Formas> forma = new ArrayList<>();
        List<Formas> formaCopear = new ArrayList<>();

        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 20;
        circulo.radio = 15;
        circulo.color = "rojo";
        forma.add(circulo);

        Circulo otroCirculo = (Circulo) circulo.clone();
        forma.add(otroCirculo);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.ancho = 10;
        rectangulo.altura = 20;
        rectangulo.color = "azul";
        forma.add(rectangulo);

        clonarYComparar(forma, formaCopear);
    }

    private static void clonarYComparar(List<Formas> forma , List<Formas> formaCopear) {
        for (Formas formas : forma) {
            formaCopear.add(formas.clone());
        }

        for (int i = 0; i < forma.size(); i++) {
            if (forma.get(i) != formaCopear.get(i)) {
                System.out.println(i + ": Las formas son objetos diferentes");
                if (forma.get(i).equals(formaCopear.get(i))) {
                    System.out.println(i + ":Y son idénticos ");
                } else {
                    System.out.println(i + ": Pero ellos no son idénticos ");
                }
            } else {
                System.out.println(i + ": Los objetos de forma son iguales. ");
            }
        }
    }
}
