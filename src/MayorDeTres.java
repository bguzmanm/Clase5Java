import java.util.Scanner;

public class MayorDeTres {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa un número:");
    int a = sc.nextInt();
    System.out.println("Ingresa otro número:");
    int b = sc.nextInt();
    System.out.println("Ingresa el último número:");
    int c = sc.nextInt();

    if (a > b && a > c) {
      System.out.printf("A: %d es el mayor\n", a);
    } else if (b > c) {
      System.out.printf("B: %d es el mayor\n", b);
    } else {
      System.out.printf("C: %d es el mayor\n", c);
    }

  }
}