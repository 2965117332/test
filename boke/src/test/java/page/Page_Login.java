package page;

import org.openqa.selenium.By;

/**
 * Created by DuanJiangtao on 2018/5/7.
 */
public class Page_Login {
    /*填写用户名*/
    public static final By LOGIN_USERNAME=By.id("ls_username");
    /*填写密码*/
    public static final By LOGIN_PWD=By.id("ls_password");
    /*登录按钮*/
    public static final By LOGIN_BTN=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    /*自动登录按钮*/
    public static final By LOGIN_ZIDONG=By.id("ls_cookietime");
    /*找回密码*/
    public static final By LOGIN_ZHAOMI=By.linkText("找回密码");
    /*注册*/
    public static final By LOGIN_ZHUCE=By.linkText("立即注册");
    /*退出*/
    public static final By LOGIN_EXIT=By.xpath("//*[@id=\"um\"]/p[1]/a[5]");
}
