package basic.c06_loops;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        int index = 1;
        while (index < 11) {
            System.out.println(index);
            index++;
        }
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int number = 0; // inicializar el índice

        do {
            System.out.println(numeros.get(number)); // obtener el elemento en la posición 'number'
            number++;
        } while (number < numeros.size()); // recorrer hasta el último elemento
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
                for (int i = 1; i <= 50; i++) {
                    if (i % 5 == 0) {
                        System.out.println(i);
                    }
                }
        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numeros2 = {2, 4, 6, 8, 10};
        int suma = 0;
        for (int numero : numeros2) {
            suma += numero;
        }
        System.out.println("La suma total es: " + suma);
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        int[] cantidad = {10, 20, 30, 40, 50};
        // Recorrer el array con for-each
        for (int numero : cantidad) {
            System.out.println(numero); // mostrar cada valor
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        // Crear un HashSet
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");

        // Recorrer con for-each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        HashMap<Integer, String> personas = new HashMap<>();
        personas.put(1, "Ana");
        personas.put(2, "Luis");
        personas.put(3, "Pedro");

        // a) Por pares clave-valor
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; // saltar los múltiplos de 3
            }
            System.out.println(i); // se imprime solo si NO es múltiplo de 3
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        // Array de ejemplo
        int[] numeros3 = {5, 8, 12, -3, 7, 10};

        // Recorrer el array
        for (int numero : numeros3) {
            if (numero < 0) {
                System.out.println("Número negativo encontrado: " + numero);
                break; // Detener el bucle
            }
            System.out.println("Número positivo: " + numero);
        }
        // 10. Crea un programa que calcule el factorial de un número dado.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int n = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);

    }
}
