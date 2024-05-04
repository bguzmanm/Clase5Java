import java.util.Scanner;

public class MayorDeDosTernario {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa un número");
    int a = sc.nextInt();
    System.out.println("Ingresa otro número");
    int b = sc.nextInt();

    /*
    if (a > b) {
      int mayor = a;
    } else {
      int mayor = b;
    } */

    int mayor = a > b ? a : b;

    System.out.printf("El mayor es %d", mayor);



  }
}
