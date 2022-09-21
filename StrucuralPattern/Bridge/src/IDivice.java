public interface IDivice {
    boolean isEnabeled();

    void enable();

    void disable();

    void setVolume(int volume);

    int getVolume();

    void setChannel(int channel);

    int getChannel();

    void printStatus();

}
