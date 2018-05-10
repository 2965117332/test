import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by DuanJiangtao on 2018/5/2.
 */
public class corss {
        @Test
        @Parameters("Browser")

        public void startBrowser(String browser){
            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","E:\\goole\\chrome.exe");
                WebDriver web=new ChromeDriver();
                web.get("http://www.baidu.com");
            }else if(browser.equalsIgnoreCase("Firefox")){
                System.setProperty("webdriver.firefox.driver","E:\\goole\\fire.exe");
                WebDriver web=new FirefoxDriver();
                web.get("http://www.bidu.com");
            }
        }
    }

