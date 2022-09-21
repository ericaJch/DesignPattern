public class Main {
    public static void main(String[] args) {
        House house=new House.HouseBuilder().Basement("Ice Bars").Interior("Ice Carvings").Roof("Ice Dome").Structure("Ice Blocks").Build();
        System.out.println(house.getBasement());
    }
}