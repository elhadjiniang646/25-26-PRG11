import java.util.Scanner;

class Cambio{
public static void main(String[] args){


    Scanner scanner = new Scanner;
        System.out.println("Hola, ¿cómo te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Muy buenas " + nombre);
        System.out.println("¿Cuánto euros tienes que pagar?");
        int pago = scanner.nextInt();
        System.out.println("¿Con cuántos euros pagas?");
        int costo = scanner.nextInt();
        int cambio = costo - pago;
        if (cambio == 0) {
            System.out.println("No hay cambio que dar.");
        } else if (cambio > 0) {
            System.out.println("El cambio es: " + cambio + " euros.");
        } else {
            System.out.println("No has dado suficiente dinero.");
        }
        scanner.close();
    }
}




