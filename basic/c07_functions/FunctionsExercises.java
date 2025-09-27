package basic.c07_functions;
import java.util.ArrayList;
/*
Clase 55 - Ejercicios: Funciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=19521
*/

public class FunctionsExercises {

    public static void main(String[] args) {
        imprimirBienvenida();
        saludar("Sergio");
        restar(7,2);
        cuadrado(2);
        esParImpar(2);
        esMayorDeEdad(18);
        longitudArray(new int[] {2,4,5,6,8,7});
        mediaArray(new int[] {2, 4, 54, 6, 5});
        factorial(5);
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");

        mostrarElementos(nombres);
    }

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void imprimirBienvenida() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }
    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }
    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static void restar(int a, int b) {
        int resultado = a - b;
        System.out.println("La resta es: " + resultado);
    }
    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static void cuadrado(int n) {
        int resultado = n * n;
        System.out.println("El cuadrado de " + n + " es: " + resultado);
    }
    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static void esParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }
    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static void esMayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Con " + edad + " años, eres mayor de edad.");
        } else {
            System.out.println("Con " + edad + " años, NO eres mayor de edad.");
        }
    }
    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static void longitudArray(int[] numeros) {
        System.out.println("La longitud del array es: " + numeros.length);
    }
    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static void mediaArray(int[] numeros) {
        if (numeros.length == 0) {
            System.out.println("El array está vacío, no se puede calcular la media.");
            return;
        }

        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }

        double media = (double) suma / numeros.length;
        System.out.println("La media del array es: " + media);
    }
    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            return;
        }

        long resultado = 1; // Usamos long para números grandes
        for (int i = 1; i <= n; i++) {
            resultado *= i; // resultado = resultado * i
        }

        System.out.println("El factorial de " + n + " es: " + resultado);
    }
    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static void mostrarElementos(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }


}
