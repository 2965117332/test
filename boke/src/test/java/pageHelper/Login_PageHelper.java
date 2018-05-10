package pageHelper;


import page.Page_Login;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/7.
 */
public class Login_PageHelper {
      /*输入用户名*/
    public static void inputuser(SeleniumUtil seleniumUtil, String user){
        seleniumUtil.waitForElementLoad(Page_Login.LOGIN_USERNAME,10);
             seleniumUtil.sendkeys(Page_Login.LOGIN_USERNAME,user);

         }
    /*输入密码*/
    public static void inputpwd(SeleniumUtil seleniumUtil, String password){
        seleniumUtil.waitForElementLoad(Page_Login.LOGIN_PWD,10);
           seleniumUtil.sendkeys(Page_Login.LOGIN_PWD,password);
    }
    /*点击登录操作*/
    public static void clicklogin(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Login.LOGIN_BTN,10);
        seleniumUtil.click(Page_Login.LOGIN_BTN);
    }
    /*登录操作*/
    public static void login(SeleniumUtil seleniumUtil,String user,String password){
        inputuser(seleniumUtil,user);
        inputpwd(seleniumUtil,password);
        clicklogin(seleniumUtil);
    }
    /*退出操作*/
    public static void exit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Login.LOGIN_EXIT,10);
        seleniumUtil.click(Page_Login.LOGIN_EXIT);
    }
}
