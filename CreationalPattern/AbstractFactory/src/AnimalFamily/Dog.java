package AnimalFamily;

public class Dog implements IAnimal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}