import java.util.InputMismatchException;
import java.util.Scanner;

public class codigoMorse {
    public static void main(String[] args) {
        int respuesta = 1;
        try {
            while (respuesta != 0) {
                Diccionario diccionario = new Diccionario();
                StringBuilder salida = new StringBuilder();
                System.out.print("Introduce tu frase a pasar a código morse: ");
                Scanner sc = new Scanner(System.in);
                String frase = sc.nextLine();
                frase = frase.toLowerCase();

                for (int i = 0; i < frase.length(); i++) {
                    salida.append(diccionario.get(frase.charAt(i))).append(" | ");
                }
                System.out.println("La traducción a morse es: ");
                System.out.println(salida);
                do {
                    System.out.print("¿Quieres volver a traducir otro mensaje? 1 --> si / 0 --> no: ");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextInt();
                } while (respuesta != 0 && respuesta != 1);
            }
        } catch (
                InputMismatchException ex) {
            System.out.println("Error: Se ha introducido un caracter o cadena no aceptados :(");
        }

    }
}
