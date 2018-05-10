package page;

import org.openqa.selenium.By;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class Page_AdminDele {
    /*默认板块*/
    public static final By MOREN_LINK= By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    /*默认第一个帖子*/
    public static final By HUIFU_TIEZI=By.name("moderate[]");
    /*删除主题按钮*/
    public static final By ADMINDELE_BTN=By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");
    /*操作下拉框*/
    public static final By ADMINDELE_XIALA=By.className("dpbtn");
    /*删除原因文本框*/
    public static final By ADMINDELE_TEXT=By.id("reason");
    /*确定删除按钮*/
    public static final By ADMINDELE_BTN1=By.id("modsubmit");

}
