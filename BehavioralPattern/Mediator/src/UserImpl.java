public class UserImpl extends User {
    private String name;
    private Mediator mediator;

    public UserImpl(String name, Mediator mediator) {
        super(name, mediator);
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void send(String msg) {
        mediator.sendMessage(msg, this);
        System.out.println(this.name + " Send " + msg);
    }

    @Override
    public void recieve(String msg) {
        System.out.println(this.name + " recieve "+msg);
    }
}
