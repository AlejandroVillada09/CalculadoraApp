package Input;

import java.util.Scanner;

public class Input {
    public int obtenerOpcionMenu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int obtenerOperando() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
