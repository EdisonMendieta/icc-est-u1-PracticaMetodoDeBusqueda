

import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Person;
import views.ShowConsole;

public class App {
    
    public static void main(String[] args) throws Exception {
        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int[] arr = new int[] {10,24, 6, 7, 8, 13, 20};
        bB.bubbleSort(arr);
        Integer result = bB.busquedaBinaria(arr, 10);
        sC.mostrarResultado(arr, result);

        PersonaController controlador = new PersonaController();
        Person[] people = new Person[] {
        new Person("Juan", 25),
        new Person("Ana",30 ),
        new Person("Pedro", 20),
        new Person("Maria", 28),
        new Person("Luis", 22),
        new Person("Carmen", 27),
        new Person("Sofia", 24),
        };
        sC.mostrarArreglo(people);
        bB.bubbleSort(people);
        sC.mostrarArreglo(people);

        Integer result1 = bB.busquedaBinaria(people,  28);
        sC.mostrarResultado(people, result1);

        sC.mostrarArreglo(arr);
        bB.bubbleSort(arr);
        sC.mostrarArreglo(arr);

         Integer result2 = bB.busquedaBinaria(arr,  8);
        sC.mostrarResultado(arr, result2);

    }
}
