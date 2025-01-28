package Math;

import Output.Output;

public class Matematico {
    public int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    public int restar(int minuendo, int sustraendo) {
        return minuendo - sustraendo;
    }

    public int multiplicar(int multiplicando, int multiplicador) {
        var producto = 0;
        for (int i = 0; i < multiplicador; i++) {
            producto += multiplicando;
        }
        return producto;
    }

    public int dividir(int dividendo, int divisor) {
        var division = divisor;
        var contador = 0;
        if (dividendo == 0) {
            Output output = new Output();
            output.mostrarNoDivisionPorCero();
            return contador;
        } else {
            for (int i = 0; i < divisor ; i++) {
                division -= dividendo;
                if(division >= 0) {
                    contador++;
                }
            }
            return contador;
        }
    }
}
