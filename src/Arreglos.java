import java.util.Scanner;

public class Arreglos {
  public static void main(String[] args) {

    System.out.println("Ingrese el largo del arreglo:");
    Scanner sc = new Scanner(System.in);
    int largo = sc.nextInt();

    int[] numeros = new int[largo];

    /*numeros[0] = 0;
    numeros[1] = 10;
    numeros[2] = 20;
    numeros[3] = 30;
    numeros[4] = 40;*/

    //System.out.printf("%d", numeros[1]);

    for (int i = 0; i < numeros.length; i++) {
      // quiero generar solo números de 2 dígitos
      numeros[i] = (int)(Math.random() * 89 + 10);
    }

    System.out.println("ARREGLO ORIGINAL");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("[%d]\n", numeros[i]);
    }

    // Ordenar de mayor a menor, los valores del arreglo.
    // Método burbuja
    for (int i = 0; i < numeros.length; i++) {
      for (int j = i; j < numeros.length; j++) {
        if (numeros[j] > numeros[i]) {
          int temp = numeros[j];
          numeros[j] = numeros[i];
          numeros[i] = temp;
        }
      }
    }

    System.out.println("ARREGLO ORDENADO");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("[%d]\n", numeros[i]);
    }

  }
}
