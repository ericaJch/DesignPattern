public class OpenFileCommand implements Command{
    private FileSystemReciever fileSystemREciever;

    public OpenFileCommand(FileSystemReciever fileSystemREciever) {
        this.fileSystemREciever = fileSystemREciever;
    }

    @Override
    public void excute() {
        this.fileSystemREciever.openFile();
    }
}
