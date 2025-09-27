package basic.c08_oop;

// Definición de la clase Book
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Método para mostrar los datos del libro
    public void showInfo() {
        System.out.println("Título: " + title + ", Autor: " + author);
    }
}