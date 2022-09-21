package AnimalFamily;

public class Duck implements IAnimal {
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}