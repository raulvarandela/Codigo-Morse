import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
@author Raul Varandela
Descripción: Clase que contiene toda la lógica de negocio
 */

public class codigoMorse {
    public static void main(String[] args) {
        int respuesta = 1;
        try {
            while (respuesta != 0) {
                StringBuilder salida = new StringBuilder();
                System.out.print("Introduce tu frase a traducir a código morse: ");
                Scanner sc = new Scanner(System.in);
                String frase = sc.nextLine();
                frase = frase.toLowerCase();
                Hashtable<String, String> diccionario = obtenerEquivalencias();

                for (int i = 0; i < frase.length(); i++) {
                    salida.append(diccionario.get( Character.toString(frase.charAt(i)).toUpperCase())).append(" | ");
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

    public static Hashtable<String, String> obtenerEquivalencias() {
        Hashtable<String, String> equivalencias = new Hashtable<>();
        equivalencias.put("A", ".-");
        equivalencias.put("B", "-...");
        equivalencias.put("C", "-.-.");
        equivalencias.put("CH", "----");
        equivalencias.put("D", "-..");
        equivalencias.put("E", ".");
        equivalencias.put("F", "..-.");
        equivalencias.put("G", "--.");
        equivalencias.put("H", "....");
        equivalencias.put("I", "..");
        equivalencias.put("J", ".---");
        equivalencias.put("K", "-.-");
        equivalencias.put("L", ".-..");
        equivalencias.put("M", "--");
        equivalencias.put("N", "-.");
        equivalencias.put("Ñ", "--.--");
        equivalencias.put("O", "---");
        equivalencias.put("P", ".--.");
        equivalencias.put("Q", "--.-");
        equivalencias.put("R", ".-.");
        equivalencias.put("S", "...");
        equivalencias.put("T", "-");
        equivalencias.put("U", "..-");
        equivalencias.put("V", "...-");
        equivalencias.put("W", ".--");
        equivalencias.put("X", "-..-");
        equivalencias.put("Y", "-.--");
        equivalencias.put("Z", "--..");
        equivalencias.put("0", "-----");
        equivalencias.put("1", ".----");
        equivalencias.put("2", "..---");
        equivalencias.put("3", "...--");
        equivalencias.put("4", "....-");
        equivalencias.put("5", ".....");
        equivalencias.put("6", "-....");
        equivalencias.put("7", "--...");
        equivalencias.put("8", "---..");
        equivalencias.put("9", "----.");
        equivalencias.put(".", ".-.-.-");
        equivalencias.put(",", "--..--");
        equivalencias.put(":", "---...");
        equivalencias.put("?", "..--..");
        equivalencias.put("'", ".----.");
        equivalencias.put("-", "-....-");
        equivalencias.put("/", "-..-.");
        equivalencias.put("\"", ".-..-.");
        equivalencias.put("@", ".--.-.");
        equivalencias.put("=", "-...-");
        equivalencias.put("!", "−.−.−−");
        equivalencias.put(" ", " ");
        return equivalencias;
    }
}
