public class ZurdoMayor {
  public static void main(String[] args) {

    boolean mayorDeEdad = false;
    boolean zurdo = true;

    if (mayorDeEdad) {
      if (zurdo) {
        System.out.println("Es mayor de edad y zurdo");
      } else {
        System.out.println("Es mayor de edad y diestro");
      }
    } else {
      if (zurdo) {
        System.out.println("Es menor de edad y zurdo");
      } else {
        System.out.println("Es menor de edad y diestro");
      }
    }

    if (mayorDeEdad && zurdo) {
        System.out.println("Es mayor de edad y zurdo");
    } else if (mayorDeEdad && !zurdo) {
        System.out.println("Es mayor de edad y diestro");
    } else if (!mayorDeEdad && zurdo) {
        System.out.println("Es menor de edad y zurdo");
    } else {
        System.out.println("Es menor de edad y diestro");
    }

    System.out.println(mayorDeEdad && zurdo
            ? "Es mayor de edad y zurdo" : mayorDeEdad && !zurdo
            ? "Es mayor de edad y diestro" : !mayorDeEdad && zurdo
            ? "Es menor de edad y zurdo" : "Es menor de edad y diestro");
  }
}
