import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniChatbot chatbot = new MiniChatbot();
        String comando = "";

        chatbot.saudar();

        do{

            System.out.print("Usuario: ");
            comando = sc.nextLine();

            chatbot.responder(comando);

        }while (!comando.contains("sair"));

    }
}
