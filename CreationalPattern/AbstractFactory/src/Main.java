import AnimalFamily.IAnimal;
import ColorFamily.IColor;

public class Main {
    public static void main(String[] args) {
        FactoryProvider factoryProvider=new FactoryProvider();
        print(factoryProvider.getFactory("Animal").create("dog"));

        print(factoryProvider.getFactory("color").create("black"));
    }

    public static void print(Object x){
        if ( x instanceof IAnimal ){
            System.out.println(((IAnimal) x).getType());
            System.out.println(((IAnimal) x).makeSound()+'\n');
        } else if (x instanceof IColor) {
            System.out.println( ((IColor) x) .getColor()+'\n');
        }
    }
}