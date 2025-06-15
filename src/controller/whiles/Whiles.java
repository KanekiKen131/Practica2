package controller.whiles;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Whiles {
     private static final Scanner sc = new Scanner(System.in);
    /**
     * Determinar si un número es palíndromo.
     *
     * @param num
     * @return
     */
    public boolean determinarNumPalindromo(int num) {
        int n = num;
        int reverso = 0;
        while (n > 0) {
            int digit = n % 10;
            reverso = reverso * 10 + digit;
            n = n / 10;
        }

        if (num == reverso) {
            System.out.println(num + " es un número palíndromo.");
            return true;   
        } else {
            System.out.println(num + " no es un número palíndromo.");
            return false;
        }
        
    }

    /**
     * Contar cuántos dígitos tiene un número
     *
     * @param valor
     * @return
     */
    public int contarDigito(int valor) {
        if (valor == 0) {
            System.out.println("El número tiene 1 dígito.");
            return 1;
        } else {
            int contarDigito = 0;
            int n = Math.abs(valor);
            while (n > 0) {
                n = n / 10;
                contarDigito++;
            }
            System.out.println("El número " + valor + " tiene " + contarDigito + " dígito(s).");
            return contarDigito;
        }
    }

    /**
     * Leer temperaturas hasta encontrar una menor a cero.
     *
     */
    public void encontrarTemperatura() {
         double temp;

    while (true) {
        System.out.print("Ingrese la temperatura: ");
        temp = sc.nextDouble();

        if (temp < 0) {
            System.out.println("Temperatura es menor a cero detectada. Terminando la lectura.");
            break;
        } else {
            System.out.println("La temperatura no es menor a cero. Continúe ingresando.");
        }
    }

    }
/**
 * Validar contraseña con tres intentos
 * @param contrasenaCorrecta
 * @param intentosUsuario
 * @return 
 */
    public boolean validarContrasenia(String contrasenaCorrecta, String[] intentosUsuario) {
        int maxIntentos = 3;
        int intentos = 0;
        boolean contrasenaValida = false;
        while (intentos < maxIntentos && intentos < intentosUsuario.length && !contrasenaValida) {
            String intentoActual = intentosUsuario[intentos]; 
            System.out.println("Intento " + (intentos + 1) + ": " + intentoActual);
            if (intentoActual.equals(contrasenaCorrecta)) {
                contrasenaValida = true;
                System.out.println("Contraseña correcta. \nIngresando...");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Te quedan " + (maxIntentos - intentos - 1) + " intentos.");
               
            }
             intentos++;
        }
        return contrasenaValida;

    }
}
