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
import java.util.Objects;

public abstract class Formas {
    public int x;
    public int y;
    public String color;

    public Formas() {
    }

    public Formas(Formas fijar) {
        if (fijar != null) {
            this.x = fijar.x;
            this.y = fijar.y;
            this.color = fijar.color;
        }
    }

    @Override
    public abstract Formas clone();

    public boolean igual(Object objeto2) {
        if (!(objeto2 instanceof Formas)) 
        return false;
        Formas formas2 = (Formas) objeto2;
        return formas2.x == x && formas2.y == y && Objects.equals(formas2.color, color);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.x;
        hash = 79 * hash + this.y;
        hash = 79 * hash + Objects.hashCode(this.color);
        return hash;
    }
}