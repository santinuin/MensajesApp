import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int option = 0;

        do {
            System.out.println("---------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensajes");
            System.out.println(" 3. Eliminar mensajes");
            System.out.println(" 4. Editar mensaje");
            System.out.println(" 5. Salir");

            //leer opcion del usuario
            option = sc.nextInt();

            switch (option){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.deleteMessage();
                    break;
                case 4:
                    MessageService.updateMessage();
                    break;
                default:
                    break;
            }

        } while (option != 5);


    }

}