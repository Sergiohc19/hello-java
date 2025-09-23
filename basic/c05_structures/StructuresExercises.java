package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] numbers = new int[5];
        System.out.println("Longitud del Array numbers:" + " " + numbers.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Puesto 0 Original:" + " " + numbers[0]);
        numbers[0] = 2;
        System.out.println("Puesto 0 Modificado:" +  " " + numbers[0]);
        // 3. Crea un ArrayList vacío.
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Tamaño del ArrayList: " + names.size());
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names.add("Sergio");
        names.add("Daniel");
        names.add("Pedro");
        names.add("Juan");
        System.out.println(names.size());
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        System.out.println(names.size());
        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> fruits = new HashSet<>();
        System.out.println(fruits.size());
        fruits.add("Naranja");
        fruits.add("Pera");
        System.out.println(fruits.size());
        System.out.println(fruits);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        fruits.add("Naranja");
        fruits.add("Manzana");
        System.out.println(fruits.size());
        System.out.println(fruits);
        // 7. Elimina uno de los elementos del HashSet.
        fruits.remove("Manzana");
        System.out.println(fruits.size());
        System.out.println(fruits);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> contacts = new HashMap<>();
        System.out.println(contacts.size());
        System.out.println(contacts);
        contacts.put("Sergio", "555222444");
        contacts.put("Daniel", "5552228884");
        contacts.put("Paula", "77722444");
        System.out.println(contacts.size());
        System.out.println(contacts);
        // 9. Modifica uno de los contactos y elimina otro.
        contacts.put("Sergio" , "222222");
        contacts.remove("Paula");
        System.out.println(contacts.size());
        System.out.println(contacts);
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        // Array inicial
        String[] cars = {"bmw", "seat", "fiat"};
        System.out.println("Longitud del array: " + cars.length);
        System.out.println("Array: " + Arrays.toString(cars));

        // 1️⃣ Convertir Array a ArrayList
        ArrayList<String> carList = new ArrayList<>(Arrays.asList(cars));
        System.out.println("ArrayList: " + carList);

        // Convertir ArrayList a HashSet
        HashSet<String> carSet = new HashSet<>(carList);
        System.out.println("HashSet: " + carSet);

        // Convertir HashSet a HashMap (clave = valor)
        HashMap<String, String> carMap = new HashMap<>();
        for (String c : carSet) {
            carMap.put(c, c);
        }
        System.out.println("HashMap: " + carMap);





    }
}
