package ChatBot;

public class ChatUser extends User {

    public ChatUser(MessageMediator mediator, String name){
        super(mediator, name);
        mediator.addUser(this);
    }
    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message,this);

    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received: " + message);

    }

    @Override
    public void leave() {
        System.out.println(this.name + " remove from the chat.");
        mediator = null;
    }

}
