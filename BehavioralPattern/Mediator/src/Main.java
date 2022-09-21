public class Main {
    public static void main(String[] args) {
        Mediator mediator=new MediatorImpl();
        User user1=new UserImpl("n1" , mediator);


        User user2=new UserImpl("n2" , mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);

        user2.send(" hello ");
//        user1.send(" hey ");
    }
}