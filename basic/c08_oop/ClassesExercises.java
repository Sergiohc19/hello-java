package basic.c08_oop;

/*
Clase 58 - Ejercicios: Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=21434
*/

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

        Book myBook = new Book("Cien años de soledad", "Gabriel García Márquez");
        myBook.showInfo();
        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        Dog myDog = new Dog();
        myDog.bark();
        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car myCar = new Car("Kia","Cerato");
        myCar.showData();
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        Student myStudent = new Student(20);
        myStudent.result();
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount myBankAccount = new BankAccount(100);
        myBankAccount.deposit(50);
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle myRectangle = new Rectangle(5, 3);
        System.out.println("Área: " + myRectangle.area());
        System.out.println("Perímetro: " + myRectangle.perimeter());
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker myWorker = new Worker("Sergio", 1500.50);
        myWorker.showSalary();
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> people = new ArrayList<>();

        // Crear objetos Person
        Person p1 = new Person("Ana", 25, "ID001");
        Person p2 = new Person("Luis", 30, "ID002");
        Person p3 = new Person("María", 22, "ID003");

        // Agregarlos al ArrayList
        people.add(p1);
        people.add(p2);
        people.add(p3);

        // Recorrer la lista y usar sayHello()
        for (Person person : people) {
            person.sayHello();
        }
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.

        Product product1 = new Product("Laptop", 1200);
        product1.showInfo();           // Precio inicial
        product1.applyDiscount(15);    // Aplica 15% de descuento
        product1.showInfo();           // Precio después del descuento

    }
}
