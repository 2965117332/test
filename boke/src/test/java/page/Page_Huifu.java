package page;

import org.openqa.selenium.By;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class Page_Huifu {
    /*默认第一个帖子*/
    public static final By HUIFU_TIEZI=By.xpath("//*[@id=\"normalthread_25\"]/tr/th/a[2]");
    /*回复按钮*/
    public static final By HUIFU_BTN=By.xpath("//*[@id=\"post_reply\"]/img");
    /*回复内容*/
    public static final By HUIFU_NEIRONG=By.id("postmessage");
    /*内容回复按钮*/
    public static final By FABIAO_BTN=By.xpath("//*[@id=\"postsubmit\"]/span");
}
