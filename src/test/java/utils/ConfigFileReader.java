package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = System.getProperty("user.dir") + "/Configuration.properties";


    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath() {
        String driverFolderPath = System.getProperty("user.dir") + "\\src\\test\\java\\driver\\";
        String exe = ".exe";
        String driverPath = driverFolderPath + properties.getProperty("driverPath") + exe;
        if (driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) {
            return Long.parseLong(implicitlyWait);
        } else {
            throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
        }
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getUsername() {
        String url = properties.getProperty("username");
        if (url != null) return url;
        else throw new RuntimeException("username not specified in the Configuration.properties file.");
    }

    public String getPassword() {
        String url = properties.getProperty("password");
        if (url != null) return url;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }

    public String getSauceLabs() {
        String url = properties.getProperty("useSauceLabs");
        if (url != null) return url;
        else throw new RuntimeException("useSauceLabs not specified in the Configuration.properties file.");
    }

    public String getLocalDriver() {
        String url = properties.getProperty("useLocalDriver");
        if (url != null) return url;
        else throw new RuntimeException("useLocalDriver not specified in the Configuration.properties file.");
    }

    public String getSaucelabsUserName() {
        String url = properties.getProperty("Sauce.user");
        if (url != null) return url;
        else throw new RuntimeException("Sauce.user not specified in the Configuration.properties file.");
    }

    public String getSauceAccessKey() {
        String url = properties.getProperty("Sauce.accessKey");
        if (url != null) return url;
        else throw new RuntimeException("Sauce.accessKey not specified in the Configuration.properties file.");
    }

    public String getSacueDispenseUrl() {
        String url = properties.getProperty("SauceDispenseUrl");
        if (url != null) return url;
        else throw new RuntimeException("Sauce.accessKey not specified in the Configuration.properties file.");
    }

    public String doApiTesting() {
        String url = properties.getProperty("apitesting");
        if (url != null) return url;
        else throw new RuntimeException("apitesting not specified in the Configuration.properties file.");
    }

    public String getAPIBaseURI() {
        String url = properties.getProperty("api.uri");
        if (url != null) return url;
        else throw new RuntimeException("api.uri not specified in the Configuration.properties file.");
    }

    public String getAPIBasePath() {
        String url = properties.getProperty("api.base.path");
        if (url != null) return url;
        else throw new RuntimeException("api.base.path not specified in the Configuration.properties file.");
    }

}
