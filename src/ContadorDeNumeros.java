import java.util.Scanner;

/**
 * Escribe un programa que lea una serie de números enteros positivos
 * desde el teclado, y cuente cuántos de ellos son pares y cuántos son impares.
 * El programa debe detenerse cuando se ingresa un número negativo.
 */

public class ContadorDeNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    int pares = 0;
    int impares = 0;

    do {
      System.out.println("Ingresa un número");
      numero = sc.nextInt();

      if (numero > 0){
        if (numero % 2 == 0) {
          pares++;
        } else {
          impares ++;
        }
      }

    } while (numero > 0);

    System.out.printf("Ingresaste %d pares, y %d impares\n", pares, impares);

  }
}
