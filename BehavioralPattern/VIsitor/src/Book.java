public class Book implements ItemElment {
    private int price ;
    private int isbnNumber;

    public Book(int price, int isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCardVisitor visitor) {
        return visitor.visit(this);
    }
}
