package ChatBot;

public class MediatorMain {

    public static void main(String[] args) {

        MessageMediator chat = new SingletonChat();

        User user1 = new ChatUser(chat,"Ivan");
        User user2 = new ChatUser(chat,"Maria");
        User user3 = new ChatUser(chat,"Georgi");

        user1.sendMessage("Hi, guys");
        user2.sendMessage("addBot");
        user3.sendMessage("cat");
        user2.sendMessage("Kude izchezna kolegata");


    }
}
