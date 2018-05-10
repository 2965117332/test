package util;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class ReadDriver {
    SeleniumUtil seleniumUtil=new SeleniumUtil();
    public String  read() throws IOException {
        Properties pro = new Properties();
        InputStream input = new FileInputStream(".\\driver.properties");
        pro.load(input);
        String driver = pro.getProperty("broswer");
        return driver;
    }

}
