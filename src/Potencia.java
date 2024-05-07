import java.util.Scanner;
/**
 * Escribe un programa que dados dos números,
 * uno entero positivo para la base, y un entero positivo para el exponente,
 * saque por pantalla el resultado de la potencia.
 * No se puede utilizar el operador de potencia.
 */
public class Potencia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la base");
    int base = sc.nextInt();

    System.out.println("Ingrese el exponente");
    int exponente = sc.nextInt();

    // base * base * base (tantas veces como diga el exponente)
    // exponente = 4 => base * base * base * base;

    long resultado = 1;

    for (int i = 1; i <= exponente ; i++) {
      // resultado += base * base;
      resultado *=base;
    }

    System.out.printf("El resultado es %d\n", resultado);

  }

}
