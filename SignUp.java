import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's fill out next form:\nWhat's your name?");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("What's your surname?");
        String surname = scanner.nextLine();

        System.out.println();
        System.out.println("Write your username, please!");
        String userName = scanner.nextLine();

        System.out.println();
        System.out.println("Create your password here!");
        String password = scanner.nextLine();

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta

        System.out.println();
        System.out.printf("Hello %s  %s, your username is %s and your password is %s, thank you for registering.%n", name, surname, userName, password);
    }
}