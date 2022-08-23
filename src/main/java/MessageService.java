import java.util.Scanner;

public class MessageService {

    public static void createMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String message = sc.nextLine();

        System.out.println("Tu nombre");
        String name = sc.nextLine();

        Message registry = new Message();

        registry.setMessage(message);
        registry.setMessage_author(name);

        MessageDAO.createMessageDB(registry);
    }

    public static void listMessage() {

        MessageDAO.readMessageDB();

    }

    public static void deleteMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar");
        int message_id = sc.nextInt();
        MessageDAO.deleteMessageDB(message_id);

    }

    public static void updateMessage() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a actualizar");
        int message_id = Integer.parseInt(sc.nextLine());
        System.out.println("Indica el mensaje nuevo");
        String message = sc.nextLine();

        Message updateMes = new Message();
        updateMes.setMessage_id(message_id);
        updateMes.setMessage(message);
        MessageDAO.updateMessageDB(updateMes);

    }
}
