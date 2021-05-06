package ChatBot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SingletonChat implements MessageMediator{

    private List<User> users;
    private Singleton chatBot;

    public SingletonChat() {
        this.users = new ArrayList<>();
        chatBot = Singleton.getInstance();
    }


    @Override
    public void sendMessage(String message, User user) {

        if(message.equals("addBot"))
        {
            System.out.println("A bot add to the chat");
            chatBot.activate();
            return;
        }

        for(User chatUser: this.users) {

            if (chatBot.getStatus()) {
                if (chatBot.checkMessage(message)) {
                    System.out.println(user.name + " kicked for uses forbidden words");
                    user.leave();
                    return;
                }
            }

            if (chatUser != user) {
                chatUser.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);

    }
}
