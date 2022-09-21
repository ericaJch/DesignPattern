public class SocketAdapterEmpl extends Socket implements ISocketAdapter {
    private Volt v;

    @Override
    public Volt get3Volt() {
        return convertVolts(40);
    }

    @Override
    public Volt get12Volt() {
        return convertVolts(10);
    }

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    public Volt convertVolts(int i) {
        v=getVolt();
        return new Volt(v.getVolt()/i);
    }
}
