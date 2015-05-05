package PropertiesFileParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesFile {

    private static PropertiesFile instance = null;

    public static PropertiesFile getInstance() {
        if (instance == null) {
            instance = new PropertiesFile();
        }
        return instance;
    }

    private PropertiesFile() {
    }

    public Map<String, String> parseProperties() throws IOException {

        Map<String, String> map = new HashMap<String, String>();
        Properties prop = new Properties();
        File file = new File("config.properties");
        FileInputStream fileInput = new FileInputStream(file);
        prop.load(fileInput);
        Enumeration<?> e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = prop.getProperty(key);
            map.put(key, value);
        }
        return map;
    }
}
