package es.iesmz.ed.algoritmes;

public class Hyperpar {
    long variable;

    public Hyperpar(long variable) {
        this.variable = variable;
    }

    public boolean esHyperPar(long variable) {
        return variable % 2 == 0;
    }
}