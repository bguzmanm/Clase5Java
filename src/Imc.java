import java.util.Scanner;

public class Imc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa tu nombre:");
    String nombre = sc.nextLine();

    System.out.println("Ingresa tu edad:");
    int edad = sc.nextInt();

    if (edad >= 18) {
      System.out.println("Ingreas tu estatura (en metros):");
      float estatura = sc.nextFloat();

      System.out.println("Ingresa tu peso (en kilos):");
      float peso = sc.nextFloat();

      float imc = peso / (estatura * estatura);

      System.out.printf("Tu IMC es igual a %.2f\n", imc);
      if (imc < 18.5) {
        System.out.println("Tu peso es bajo");
      } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Estas dentro del rango normal");
      } else if (imc >= 25 && imc <= 29.9) {
        System.out.println("Tienes sobrepeso");
      } else {
        System.out.println("Estas obseso");
      }

    } else {
      System.out.println("Anda a jugar minecraft!");
    }
  }
}
