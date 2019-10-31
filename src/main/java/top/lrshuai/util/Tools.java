package top.lrshuai.util;

import java.io.File;
import java.io.IOException;

/**
 * @author rstyro
 */
public class Tools {

    public static void createFileOrDir(File file) throws IOException {
        File parentFile = file.getParentFile();
        if(!parentFile.exists()){
            parentFile.mkdirs();
        }
        if(!file.exists()){
            file.createNewFile();
        }
    }
}
