public class TV implements IDivice {
    private boolean on = false;
    private int channel = 1;
    private int volume = 30;

    @Override
    public boolean isEnabeled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume=volume;
        if (volume > 100) {
            volume = 100;
        } else if (volume < 0) {
            volume = 0;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void printStatus() {
        System.out.println("TV :\n");
        System.out.println(" It's "+(on? "enable" : "disable"));
        System.out.println("channel : "+getChannel());
        System.out.println("volume : "+getVolume());
    }
}
