package ChatBot;

public class Singleton {
    private static Singleton instance;

    private boolean bot;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public boolean checkMessage(String message) {
        if (message.contains("cat")){
            return true;
        }
        return false;
    }

    public void activate(){
        bot = true;
    }

    public boolean getStatus(){
        return bot;
    }


}

