public class Main {
    public static void main(String[] args) {
        ISocketAdapter socketAdapter = new SocketAdapterEmpl();
        System.out.println("v3 volts using Class Adapter= "+getVolt(socketAdapter , 3).getVolt());
        System.out.println("v12 volts using Class Adapter= "+getVolt(socketAdapter , 12).getVolt());
        System.out.println("v120 volts using Class Adapter= "+getVolt(socketAdapter , 120).getVolt());

    }

    public static Volt getVolt(ISocketAdapter socketAdapter, int i) {
        return switch (i) {
            case 3 -> socketAdapter.get3Volt();
            case 12 -> socketAdapter.get12Volt();
            case 120 -> socketAdapter.get120Volt();
            default -> null;
        };
    }
}