package pageHelper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import page.Page_Huifu;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class Huifu_PageHelper {
    /*点击帖子*/
    public static void cilckbTiezi(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_Huifu.HUIFU_TIEZI,10);
        seleniumUtil.click(Page_Huifu.HUIFU_TIEZI);
    }
    /*点击回复按钮*/
    public static void cilckbBtn(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_Huifu.HUIFU_BTN,10);
        seleniumUtil.click(Page_Huifu.HUIFU_BTN);
    }
    /*输入内容*/
    public static void sendneirong(SeleniumUtil seleniumUtil,String neirong) {
        seleniumUtil.waitForElementLoad(Page_Huifu.HUIFU_NEIRONG,10);
        seleniumUtil.sendkeys(Page_Huifu.HUIFU_NEIRONG,neirong);
    }
    /*点击发表按钮*/
    public static void fabiao(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_Huifu.FABIAO_BTN,10);
        seleniumUtil.click(Page_Huifu.FABIAO_BTN);
    }
    /*回复帖子*/
    public static void browser(SeleniumUtil seleniumUtil,String neirong) throws InterruptedException {
        AllBlock_PageHelper.cilckbMoren(seleniumUtil);
        cilckbTiezi(seleniumUtil);
        cilckbBtn(seleniumUtil);
        sendneirong(seleniumUtil,neirong);
        fabiao(seleniumUtil);

    }

}
