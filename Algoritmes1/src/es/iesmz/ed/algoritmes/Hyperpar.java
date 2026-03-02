package es.iesmz.ed.algoritmes;

public class Hyperpar {
    public static boolean esHyperpar(int numero) {
        numero = Math.abs(numero);

        if (numero == 0) {
            return true;
        }

        while (numero > 0) {
            int digito = numero % 10;

            if (digito % 2 != 0) {
                return false;
            }
            numero /= 10;
        }
        return true;
    }
}