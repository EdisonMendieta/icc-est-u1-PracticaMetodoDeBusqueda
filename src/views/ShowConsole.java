package views;

import models.Person;

public class ShowConsole {

    public void mostrarResultado(Person[] persona, Integer posicion){

        if (posicion == null) {
            System.out.println("No se encontro a la persona");
            
        }else{
            System.out.println("Se encontro a " + persona[posicion] + " en la posicion: " + posicion);
        }
    }
    
    public void mostrarResultado(int[] persona, Integer posicion){

        if (posicion == null) {
            System.out.println("No se encontro a la persona");
            
        }else{
            System.out.println("Se encontro a " + persona[posicion] + " en la posicion: " + posicion);
        }
    }
}
