package basic.c08_oop;

    public class Product {
        String name;
        double price;

        // Constructor
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // Método para aplicar descuento
        public void applyDiscount(double percentage) {
            if (percentage > 0 && percentage <= 100) {
                price = price - (price * percentage / 100);
                System.out.println("Se aplicó un descuento del " + percentage + "%, nuevo precio: " + price);
            } else {
                System.out.println("Descuento no válido");
            }
        }

        // Método opcional: mostrar info del producto
        public void showInfo() {
            System.out.println("Producto: " + name + ", Precio: " + price);
        }
    }

