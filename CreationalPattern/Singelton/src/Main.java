public class Main {
    public static void main(String[] args) {
        DataBaseSingletonExample dataBaseSingletonExample = DataBaseSingletonExample.getInstance();
        dataBaseSingletonExample.insertIntoList("Erica");
        
        TempleClass templeClass = new TempleClass();
        dataBaseSingletonExample.insertIntoList("iman");

        dataBaseSingletonExample.getList().forEach(System.out::println);
    }


}