import java.util.concurrent.*;
import java.net.*;
import java.nio.file.*;
import java.io.*;

public class DownloaderTask implements Callable<String> {
    
    @Override
    public String call() throws Exception {
        URL source = new URL("https://img-9gag-fun.9cache.com/photo/aGZA1v7_460svvp9.webm");
        Path dest = Paths.get("./download.webm");
        
        InputStream is = source.openStream();
        Files.copy(is, dest, StandardCopyOption.REPLACE_EXISTING);
        
        return "done";
    }
}