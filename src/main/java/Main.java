import java.util.Scanner;
import java.util.Random;

public class Main {
  
  public static void main(String[] args) {
    // Se imprime nombre, apellido y documento del estudiante 
    System.out.println("****** Asignatura: Fundamentos de la programación ******");
    System.out.println("");
    System.out.println("********* Ingeniería de Software *********");
    System.out.println("");
    System.out.println("Nombre: Karen Steffany Ortegón Alemán");
    System.out.println("Documento de Identidad: 1233900909");
    System.out.println("");


    //Crear objeto Scanner para entrada del usuario 
    Scanner scanner = new Scanner(System.in);


    //Solicitar el nombre del jugador 
    System.out.println("•❤•.¸✿¸.•❤•.❀• ¡Bienvenido a Adivina el Número Secreto! •❀.•❤•.¸✿¸.•❤•");
    System.out.println("");
    System.out.print("Por favor, ingresa tu nombre: ");
    System.out.println("");
    String nombreJugador = scanner.nextLine();
    System.out.println("ʕ•́ᴥ•̀ʔっ Hola, " + nombreJugador + "!");
    System.out.println("");

    //Generar número secreto aleatorio entre 1 y 20
    Random random = new Random();
    int numeroSecreto = random.nextInt(20) + 1;


    //Solicitar al jugador adivinar el número secreto
    System.out.println("Intenta adivinar el número secreto (entre 1 y 20): ٩(˘◡˘)۶");
    System.out.println("");
    int numeroJugador = scanner.nextInt();


    //Comprobar si el número ingresado es igual al número secreto
    if (numeroJugador == numeroSecreto) {
      System.out.println("¡Felicidades, " + nombreJugador + "! Has adivinado el número secreto  (" + numeroSecreto + ") correctamente (っ＾▿＾)💨");
    }else {
    //Comprobar si el número ingresado es mayor o menor el número          secreto
    if (numeroJugador < numeroSecreto) {
      System.out.println("Lo siento, " + nombreJugador + ". El número secreto es mayor que " + numeroJugador + " (╥﹏╥)");
    } else {
      System.out.println("Lo siento, " + nombreJugador + ". El número secreto es menor que " + numeroJugador + " (╥﹏╥)");
      }
  }

    //Cerrar el Scanner
    scanner.close();

   }

}