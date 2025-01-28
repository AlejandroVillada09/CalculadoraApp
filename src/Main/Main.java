package Main;

import Input.Input;
import Math.Matematico;
import Output.Output;
import Validator.Validador;

public class Main {
    final static SUMAR =1;
    final static RESTAR =2;
    final static MULTIPLICAR =3;
    final static DIVIDIR =4;
    private static int opcionMenu;
    private static int operando1;
    private static int operando2;

    public static void main(String[] args) {
        boolean quiereQuedarse = true;
        do {
            boolean esValido;
            do {
                mostrarMenu();
                obtenerOpcionMenu();
                esValido = validarOpcionMenu();
            } while (!esValido);
            if (opcionMenu == 1) {
                quiereQuedarse = false;
            } else {
                ejecutarOperacion();
            }
        } while (quiereQuedarse);
    }

    private static void mostrarMenu() {
        Output output = new Output();
        output.mostrarMenu();
    }

    private static void obtenerOpcionMenu() {
        Input input = new Input();
        opcionMenu = input.obtenerOpcionMenu();
    }

    private static boolean validarOpcionMenu() {
        Validador validador = new Validador();
        boolean esValido = validador.validarOpcionMenu(opcionMenu);
        return esValido;
    }
    private static void ejecutarOperacion() {
        Input input = new Input();
        Output output = new Output();
        output.pedirOperando();
        operando1 = input.obtenerOperando();
        output.pedirOperando();
        operando2 = input.obtenerOperando();
        Matematico matematico = new Matematico();

        switch (opcionMenu){
            case SUMAR -> output.mostrarResultado(operacion.sumar(operando1,operando2));
            case RESTAR -> output.mostrarResultado(operacion.restar(operando1,operando2));
            case MULTIPLICAR -> output.mostrarResultado(operacion.multiplicar(operando1,operando2));
            case DIVIDIR -> output.mostrarResultado(operacion.dividir(operando1,operando2));
        }
    }
}


