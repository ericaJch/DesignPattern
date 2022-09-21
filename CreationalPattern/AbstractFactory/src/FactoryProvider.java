public class FactoryProvider {
    public  IAbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Animal")) {
            return new AnimalFactory();
        } else if (choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }
}
