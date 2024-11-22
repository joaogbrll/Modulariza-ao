import java.util.Scanner;

public class MiniChatbot {

    public void saudar(){
        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");
    }


    public void responder(String line) {
        line = line.toLowerCase();
        if (line.contains("olá") || line.contains("oi")) {
            System.out.println("Olá! Como posso te ajudar hoje?");
        } else if (line.contains("seu nome")) {
            System.out.println("Meu nome é MiniChatbot.");
        } else if (line.contains("como você está")) {
            System.out.println("Estou funcionando perfeitamente, obrigado!");
        } else {
            System.out.println("Desculpe, não entendi sua pergunta. Pode reformular?");
        }
    }
}