package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by CHITTU on 29-Oct-16.
 */
public class Popertyreader {

    public void readPropertyFile(String fileName,String keys){

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(fileName));
            prop.getProperty(keys);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
