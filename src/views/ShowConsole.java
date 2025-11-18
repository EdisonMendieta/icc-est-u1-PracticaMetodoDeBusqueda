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

    public void mostrarArreglo(int[] arr){
        System.out.println("Elementos del arreglo: ");
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", " );
        }
        System.out.println("]");
    }

    public void mostrarArreglo(Person[] arr){
        System.out.print("Elementos del arreglo: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] );
        }
        System.out.println();
    }
}
