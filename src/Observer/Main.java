package Observer;

public class Main {

    public static void main(String[] args) {

        PostOffice postOffice = new PostOffice();
        Person petur = new Person("Petur");
        Person ivan = new Person(("Ivan"));
        Mail m = new Mail("Petur","Plovdiv","Zdravei");

        postOffice.Attach(petur);
        postOffice.Attach(ivan);

        postOffice.addMail(m);
    }
}
