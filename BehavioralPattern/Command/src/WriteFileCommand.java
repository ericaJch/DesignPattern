public class WriteFileCommand implements Command{
    private FileSystemReciever fileSystemREciever;

    public WriteFileCommand(FileSystemReciever fileSystemREciever) {
        this.fileSystemREciever = fileSystemREciever;
    }

    @Override
    public void excute() {
        this.fileSystemREciever.writeFile();
    }
}
