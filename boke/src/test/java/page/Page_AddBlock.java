package page;

import org.openqa.selenium.By;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class Page_AddBlock {
    /*管理中心按钮*/
    public static final By GUANLI_BTN=By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    /*填入密码*/
    public static final By MIMA_TEXT=By.name("admin_password");
    /*提交密码按钮*/
    public static final By SUBMITMIMA_BTN=By.name("submit");
    /*论坛*/
    public static final By LUNTAN_BTN=By.id("header_forum");
    /*添加板块*/
    public static final By ADD_BANKUAI=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");
    /*板块名字*/
    public static final By ADD_TEXT=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[1]/td[3]/div/input");
    /*提交按钮*/
    public static final By SUBMITADD_BTN=By.id("submit_editsubmit");

}
