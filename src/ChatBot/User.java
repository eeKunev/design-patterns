package ChatBot;

import java.awt.*;

public abstract class User {

    protected MessageMediator mediator;
    protected String name;

    public User(MessageMediator mediator,String name)
    {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
    public abstract void leave();

}
