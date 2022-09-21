public class FileSystemReceiverUtil {

    public static FileSystemReciever getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFlieSystemReciver();
        }else{
            return new UnixFileSystemReceiver();
        }
    }

}