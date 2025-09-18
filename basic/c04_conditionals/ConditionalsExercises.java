package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 32;
        if (age < 18) {
            System.out.println("No puede votar");
        } else if (age >= 18) {
            System.out.println("Puede votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int numero1 = 2;
        int numero2 = 3;
        if (numero1 < numero2) {
            System.out.println("numero2 es mayor a numero1");
        } else if (numero1 > numero2) {
            System.out.println("numero2 es menor a numero1");
        } else {
        System.out.println("numero2 es igual a numero1");
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int number = 4;
        if ( number < 0) {
            System.out.println("El numero es negativo");
        } else if (number > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es cero");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        if ( number % 2 == 0 ) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        if (number >= 1 && number <= 100) {
            System.out.println("El numero esta en el rango del 1 al 100");
        } else {
            System.out.println("El numero no esta en el rango del 1 al 100");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            default:
                System.out.println("Día Inválido");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 72;

        if (nota >= 90 && nota <= 100) {
            System.out.println("Sobresaliente");
        } else if (nota >= 50 && nota < 90) {
            System.out.println("Aprobado");
        } else if (nota >= 0 && nota < 50) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Nota inválida");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad = 14;
        if (edad >= 15) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes ir al cine solo, te tiene que acompañar un adulto");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'E';
        letra = Character.toLowerCase(letra);
        if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
            if (letra >= 'a' && letra <= 'z') {
                System.out.println("Es una consonante");
            } else {
                System.out.println("No es una letra válida");
            }
        } else {
            System.out.println("Es una vocal");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 7;
        int b = 12;
        int c = 5;

        if (a >= b && a >= c) {
            System.out.println("El mayor es a: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es b: " + b);
        } else {
            System.out.println("El mayor es c: " + c);
        }
        // Otra forma de resolver el Ejercicio 10:
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);


    }
}
