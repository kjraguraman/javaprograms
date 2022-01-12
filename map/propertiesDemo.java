package collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class propertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("C:\\intelij-workspace\\src\\collection\\map\\test.properties");
        properties.load(fis);
        System.out.println(properties);
        properties.put("check","1");
        properties.setProperty("1","ragu");
        System.out.println(properties);
        FileOutputStream fos=new FileOutputStream("C:\\intelij-workspace\\src\\collection\\map\\test.properties");
        properties.store(fos,"file edited");
        Set s=properties.keySet();
        System.out.println(s);
    }
}
