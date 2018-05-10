package pageHelper;

import page.Page_AddBlock;
import page.Page_Send;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/7.
 */
public class Send_PageHelper {
    /*输入标题*/
    public static void sendtitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.waitForElementLoad(Page_Send.SEND_TITLE_TEXT,10);
        seleniumUtil.sendkeys(Page_Send.SEND_TITLE_TEXT,title);
    }
    /*输入内容*/
    public static void sendneirong(SeleniumUtil seleniumUtil,String neirong){
        seleniumUtil.waitForElementLoad(Page_Send.SEND_NEIRONG_TEXT,10);
        seleniumUtil.sendkeys(Page_Send.SEND_NEIRONG_TEXT,neirong);
    }
    /*点击发表*/
    public static void clicksend(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Send.SEND_BUTTON,10);
        seleniumUtil.click(Page_Send.SEND_BUTTON);
    }
    /*发表文章*/
    public static void sendarticle(SeleniumUtil seleniumUtil,String title,String neirong){
        sendtitle(seleniumUtil,title);
        sendneirong(seleniumUtil,neirong);
        clicksend(seleniumUtil);
    }
}
