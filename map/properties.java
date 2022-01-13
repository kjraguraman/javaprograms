package collection.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("C:\\intelij-workspace\\src\\collection\\map\\test.properties");
        properties.load(fis);
        //properties.put("4","Prem");
        //properties.put("null","Check null");
        System.out.println(properties);
        FileOutputStream fos=new FileOutputStream("C:\\intelij-workspace\\src\\collection\\map\\test.properties");
        properties.store(fos,"Properties practice");
        System.out.println(properties);
    }
}
