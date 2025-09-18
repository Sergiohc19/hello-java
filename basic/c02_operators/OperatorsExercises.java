package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 1;
        int b = 2;
        int resultado = a + b;
        System.out.println(resultado);
        // 2. Crea una variable para cada tipo de operación de asignación.
        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(1 < 2 && 2 < 3);
        System.out.println(2 < 2 || 2 < 3);
        System.out.println(!(2 < 2) || 2 < 3);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(2 < 2 && 2 < 3);
        System.out.println(2 < 2 || 3 < 3);
        System.out.println(!(2 < 2) && 2 < 2);
        // 5. Utiliza el operador lógico and.
        System.out.println( 2 == 2 && 3 < 1);
        // 6. Utiliza el operador lógico or.
        System.out.println( 2 == 2 || 3 < 1);
        // 7. Combina ambos operadores lógicos.
        System.out.println((2 == 2 && 3 < 1) || ( 2 == 2 || 3 < 1));
        // 8. Añade alguna negación.
        System.out.println(!(2 < 2) || 2 < 3);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println(++b);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println( ((2 + 3) * 2 > 8) && (10 / 2 == 5) );

    }
}
