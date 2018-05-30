package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pageHelper.Login_PageHelper;
import util.ConfigurationLog;
import util.ReadDriver;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by DuanJiangtao on 2018/5/7.
 */
public class BasicTestcase {
    SeleniumUtil seleniumUtil=null;
    ReadDriver readDriver=new ReadDriver();
@BeforeClass
    public void initTest() throws IOException {
    ConfigurationLog.inform();
    seleniumUtil=new SeleniumUtil();
    String driver=readDriver.read();
    if(driver.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
    }else if(driver.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","D:\\chrome\\geckodriver.exe");
    }
    seleniumUtil.getDriver(driver);
    seleniumUtil.url("http://127.0.0.1/upload");
}


    @AfterClass
    public void endTest() throws InterruptedException, IOException {
      Login_PageHelper.exit(seleniumUtil);
        Thread.sleep(3);
        seleniumUtil.quit();
    }
}
