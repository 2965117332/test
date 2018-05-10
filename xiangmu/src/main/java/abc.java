import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by DuanJiangtao on 2018/5/2.
 */
public class abc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\goole\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.163.com/");
    }
}
