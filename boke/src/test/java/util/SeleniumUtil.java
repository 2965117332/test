package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

/**
 * Created by DuanJiangtao on 2018/5/7.
 */
public class SeleniumUtil {
     WebDriver driver=null;
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    /*打开驱动*/
    public WebDriver getDriver(String drivertype){
        if(drivertype.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
            logger.info("启动谷歌驱动");
        }else if (drivertype.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
            logger.info("启动火狐驱动");
        }else{
            logger.error("驱动启动失败");
        }return driver;
    }
    /*打开网址*/
     public void url(String url){
      driver.get(url);
        logger.info("打开网址"+url);
    }

    /*查找元素*/
    public WebElement findelement(By by){
        WebElement ele=null;
       try {
           ele=driver.findElement(by);
           logger.info("找到元素"+getLocatorByElement(ele,">"));
       }catch (NoSuchElementException e){
           logger.error("没找到"+getLocatorByElement(ele,">"));
       }return ele;
    }
    /*元素定位置*/
    public String getLocatorByElement(WebElement ele,String str){
        String text=ele.toString();
        String  te=text.substring(text.indexOf(str)+1,text.length()-1);
        return te;
    }
    /*查找一组元素*/
    public List<WebElement> findelements(By by){
        List<WebElement> eles=null;
        eles=driver.findElements(by);
        logger.info("找到一组元素");
        return eles;
    }
    /*清空元素内容*/
    public void clear(By by){
        findelement(by).clear();
        logger.info("成功清空");
    }
     /*文本框输入内容*/
    public void sendkeys(By by,String neirong){
        clear(by);
        findelement(by).sendKeys(neirong);
        logger.info("输入成功");
    }
    /*对元素进行点击*/
    public void click(By by){
        findelement(by).click();
        logger.info("点击成功");
    }
    /*获取控件内容*/
    public String gettext(By by) {
        String str=findelement(by).getText();
        logger.info("获得控件内容");
        return str;
    }
    /*跳转窗口*/
    public void getwindown(){
        Set<String> windows=driver.getWindowHandles();
        for (String window:windows
             ) {
            if(window.equals(driver.getWindowHandle())){
               continue;
            }else{
                driver.switchTo().window(window);
                logger.info("跳转成功"+window);
            }
        }
    }
     /*跳转iframe*/
     public void getiframe(String name){
         driver.switchTo().frame(name);
         logger.info("跳转iframe");
     }
     /*判断标题是否一致*/
    public void gettitle(String excepttitle){
        String actultite=driver.getTitle();
        try {
            Assert.assertEquals(actultite,excepttitle);
        }catch (AssertionError e){
            e.printStackTrace();
           logger.error("预期标题："+excepttitle+"实际标题为："+actultite);
        }
        logger.info("找到了对应的标题;"+actultite);
    }
    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }
    /*返回主页*/
    public void backhome(){
        driver.switchTo().defaultContent();
    }
    /*鼠标悬停*/
    public void clickAndHold(By by){
        Actions action=new Actions(driver);
        action.clickAndHold(findelement(by)).perform();
    }
}
