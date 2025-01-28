package Validator;

public class Validador {
    public boolean validarOpcionMenu(int opcionMenu) {
        if( opcionMenu < 6 && opcionMenu > 0){
            return true;
        }else{
            return false;
        }
    }
}
