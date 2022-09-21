package AnimalFamily;

public class Bear implements IAnimal {
    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Growl";
    }
}