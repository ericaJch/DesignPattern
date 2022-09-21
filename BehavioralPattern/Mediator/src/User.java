public abstract class User {
    private String name;
    private Mediator mediator;

    public User(String name , Mediator mediator) {
        this.mediator=mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void recieve(String msg );

}
