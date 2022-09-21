public class Main {
    public static void main(String[] args) {
        ItemElment[] itemElments = new ItemElment[]{new Fruit(12, "Appple", 2),
                new Book(210, 852),
                new Fruit(57, "banana", 8754),
                new Book(99, 865)};

        int total=totalCost(itemElments);
        System.out.println(total);
    }

    public static int totalCost(ItemElment[] items){
        ShoppingCardVisitor visitor=new ShoppingCardVisitorImpl();
        int total=0 ;
        for (ItemElment elment: items ) {
            total+= elment.accept(visitor);
        }
    return total;
    }
}