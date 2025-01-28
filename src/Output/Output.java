package Output;

public class Output {
    public void mostrarMenu() {
        System.out.println("""
                Menú Calculadora
                ----------------
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                Ingrese una opción: """);
    }

    public void pedirOperando() {
        System.out.println("Ingrese un operando:");
    }

    public void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
        System.out.println("");
    }
    public void mostrarNoDivisionPorCero() {
        System.out.println("No se puede dividir por cero.");
    }

}
