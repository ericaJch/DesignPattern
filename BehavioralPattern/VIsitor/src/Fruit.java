public class Fruit implements ItemElment{
     private int price ;
     private String name;
     private int weight;

    public Fruit(int price, String name, int weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int accept(ShoppingCardVisitor visitor) {
        return visitor.visit(this);
    }
}
