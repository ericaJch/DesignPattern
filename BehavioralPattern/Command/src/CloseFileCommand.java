public class CloseFileCommand implements Command{
    private FileSystemReciever fileSystemREciever;

    public CloseFileCommand(FileSystemReciever fileSystemREciever) {
        this.fileSystemREciever = fileSystemREciever;
    }

    @Override
    public void excute() {
        this.fileSystemREciever.closeFile();
    }
}
