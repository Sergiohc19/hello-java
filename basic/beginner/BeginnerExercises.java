package basic.beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Sergio";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 32;
        System.out.println(edad);

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.2;
        System.out.println(altura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean verdad = true;
        System.out.println("¿Te gusta programar? " + verdad);

        // 5. Declara una constante con tu email.
        final String EMAIL = "Sergiohernandez@hotmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'S';
        System.out.println(inicial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Valdemoro";
        localidad = "Aranjuez";
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 1;
        int b = 2;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Tipo de la variable 'name': " + name.getClass().getSimpleName());
        System.out.println("Tipo de la variable 'edad': " + ((Object)edad).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String Comida;
        Comida = "Arroz";
        System.out.println(Comida);
    }
}
