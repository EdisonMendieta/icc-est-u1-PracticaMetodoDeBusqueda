package controllers;

import models.Person;

public class BusquedaBinaria {

    public Integer busquedaBinaria(int[] arr, int objet){
        int derecha = arr.length;
        int izquierda = 0;
        while (izquierda <= derecha ) {
            int medio = (izquierda + derecha) / 2 ;
            System.out.print("bajo = " + izquierda + " Alto = " 
                                + derecha + " Medio = "     
                                + medio + " valorCentro = " + arr[medio]);

            if (arr[medio] == objet) {
                System.out.println(" --> Encontrado");
                return medio;               
            }
            
            //2do decido si busco en la derecha o izquierda
            if (arr[medio] < objet) {
                izquierda = medio + 1; 
                System.out.println(" --> Buscando en la derecha");
            }else{
                derecha = medio - 1;
                System.out.println(" --> Busqueda a la izquierda");
            }
            System.out.print(" | ");
            for (int i = izquierda; i <= derecha; i++) {
                System.out.print(arr[i] + " | ");
            }
            System.out.println();
        }


        return null;
    }

    public Integer busquedaBinaria(Person[] arr, int objet){
        int derecha = arr.length;
        int izquierda = 0;
        while (izquierda <= derecha ) {
            int medio = (izquierda + derecha) / 2 ;

            System.out.print("bajo = " + izquierda + " Alto = " 
                                + derecha + " Medio = "     
                                + medio + " valorCentro = " + arr[medio]);


            if (arr[medio].getEdad() ==objet) {
                System.out.println(" --> Encontrado");
                return medio;

            }else if (arr[medio].getEdad() < objet) {
                izquierda = medio + 1; 
                System.out.println(" --> Buscando en la derecha");
            }else{
                derecha = medio - 1;
                System.out.println(" --> Buscando en la izquierda");
            }
        }


        return null;
    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public void bubbleSort(Person[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].getEdad() > arr[j + 1].getEdad()) {
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            } 
        }
    }
}
