package pageHelper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.Page_AdminDele;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class AdminDele_PageHelper {
    /*点击默认板块按钮*/
    public static void cilckbMoren(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_AdminDele.MOREN_LINK,10);
        seleniumUtil.click(Page_AdminDele.MOREN_LINK);
    }
    /*点击帖子*/
    public static void cilckbTiezi(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_AdminDele.HUIFU_TIEZI,10);
        seleniumUtil.click(Page_AdminDele.HUIFU_TIEZI);
    }
    /*点击删除按钮*/
    public static void delebtn(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AdminDele.ADMINDELE_BTN,10);
        seleniumUtil.click(Page_AdminDele.ADMINDELE_BTN);
    }
    /*点击原因下拉框按钮*/
    public static void delexiala(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AdminDele.ADMINDELE_XIALA,10);
        seleniumUtil.click(Page_AdminDele.ADMINDELE_XIALA);
        Select list=new Select(seleniumUtil.findelement(Page_AdminDele.ADMINDELE_XIALA));
        list.selectByIndex(2);
    }
    /*自写原因*/
    public static void delezixie(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AdminDele.ADMINDELE_TEXT,10);
        seleniumUtil.sendkeys(Page_AdminDele.ADMINDELE_TEXT,"违规操作");
    }
    /*点击确定按钮*/
    public static void delebtn1(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AdminDele.ADMINDELE_BTN1,10);
        seleniumUtil.click(Page_AdminDele.ADMINDELE_BTN1);
    }
    /*直接删除*/
    public static void deletitle(SeleniumUtil seleniumUtil) throws InterruptedException {
        cilckbMoren(seleniumUtil);
        cilckbTiezi(seleniumUtil);
        delebtn(seleniumUtil);
        delezixie(seleniumUtil);
        delebtn1(seleniumUtil);
    }
}
