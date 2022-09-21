public class Main {
    public static void main(String[] args) {
        FileSystemReciever fileSystemReciever=FileSystemReceiverUtil.getUnderlyingFileSystem();

        FileSystemReciever fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        FileInvoker file = new FileInvoker(openFileCommand);

        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();

    }
}