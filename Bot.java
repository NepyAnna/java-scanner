import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner

        System.out.println("Hola, ¿Cómo te llamas?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hola %s! Soy FemBot. ¿De qué ciudad eres?%n", name);

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        String location = scanner.nextLine();
        System.out.printf("He escuchado que %s es un encanto. Yo nací en Oracle city.%n", location);
        System.out.println("¿Cuántos años tienes?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        byte age = scanner.nextByte();
        scanner.nextLine();

        System.out.printf("Entonces me dices que tienes %d años. Yo tengo 400 años.%n", age);
        System.out.printf("Eso quiere decir que soy %d veces más vieja que tu.%n", 400/age);
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato
        //Añade una nueva línea.
        String language = scanner.nextLine();

        System.out.printf("%s, ¡Eso es excelente! Mucho gusto haber hablado contigo %s, ¡Hablamos luego!%n", language, name);

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner

    }
}
