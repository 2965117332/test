package pageHelper;

import org.openqa.selenium.support.ui.Select;
import page.Page_Toupiao;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/9.
 */
public class TouPiao_PageHelper {
    /*点击发帖*/
    public static void fatiebtn(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Toupiao.FATIE_BTN,10);
        seleniumUtil.click(Page_Toupiao.FATIE_BTN);
    }
    /*点击投票*/
    public static void toupiaobtn(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Toupiao.TOUPIAO_BTN,10);
        seleniumUtil.click(Page_Toupiao.TOUPIAO_BTN);
    }
    /*投票主题*/
    public static void zhuti(SeleniumUtil seleniumUtil,String timu){
        seleniumUtil.waitForElementLoad(Page_Toupiao.TOUPIAO_TEXT,10);
        seleniumUtil.sendkeys(Page_Toupiao.TOUPIAO_TEXT,timu);
    }
    /*第一方*/
    public static void first(SeleniumUtil seleniumUtil,String nei){
        seleniumUtil.waitForElementLoad(Page_Toupiao.TOUPIAO_TEXT1,10);
        seleniumUtil.sendkeys(Page_Toupiao.TOUPIAO_TEXT1,nei);
    }
    /*第二方*/
    public static void second(SeleniumUtil seleniumUtil,String nei){
        seleniumUtil.waitForElementLoad(Page_Toupiao.TOUPIAO_TEXT2,10);
        seleniumUtil.sendkeys(Page_Toupiao.TOUPIAO_TEXT2,nei);
    }
    /*点击投票*/
    public static void button(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Toupiao.TOUPIAO_BUTTON,10);
        seleniumUtil.click(Page_Toupiao.TOUPIAO_BUTTON);
    }

}
