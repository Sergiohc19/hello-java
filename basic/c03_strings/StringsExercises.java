package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Sergio";
        String surname = "Garcia";
        String fullname = name + " " + surname;
        System.out.println(fullname);
        // 2. Muestra la longitud de una cadena de texto.
        var longitud = fullname.length();
        System.out.println(longitud);
        // 3. Muestra el primer y último carácter de un string.
        var caracter = "" + name.charAt(0) + name.charAt(name.length() - 1);
        System.out.println("Primer y último carácter: " + caracter);
        // 4. Convierte a mayúsculas y minúsculas un string.
        var mayusculas = name.toUpperCase();
        System.out.println(mayusculas);
        var minusculas = name.toLowerCase();
        System.out.println(minusculas);
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        var content = name.contains("S");
        System.out.println(content);
        // 6. Formatea un string con un entero.
        int age = 32;
        var stringFormat =  String.format(" Mi nombre es %s y mi edad es de %d años ", name, age);
        System.out.println(stringFormat);
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Esta frase es para quitar los espacios ".trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(" Esta frase es para quitar los espacios ".trim().replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(surname));
        // 10. Comprueba si dos strings tienen la misma longitud.
        if (name.length() == surname.length()) {
            System.out.println("Tienen la misma longitud");
        } else {
            System.out.println("No tienen la misma longitud");
        }
    }
}
