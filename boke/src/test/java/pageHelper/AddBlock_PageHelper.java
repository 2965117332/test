package pageHelper;

import page.Page_AddBlock;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class AddBlock_PageHelper {
    /*点击管理中心*/
    public static void clickguanli(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AddBlock.GUANLI_BTN,10);
     seleniumUtil.click(Page_AddBlock.GUANLI_BTN);
    }
    /*输入密码*/
    public static void sendmima(SeleniumUtil seleniumUtil,String mima){
        seleniumUtil.waitForElementLoad(Page_AddBlock.MIMA_TEXT,10);
        seleniumUtil.sendkeys(Page_AddBlock.MIMA_TEXT,mima);
    }
    /*提交密码*/
    public static void clickmima(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_AddBlock.SUBMITMIMA_BTN,10);
        seleniumUtil.click(Page_AddBlock.SUBMITMIMA_BTN);
    }
    /*点击论坛*/
    public static void clickluntan(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AddBlock.LUNTAN_BTN,10);
        seleniumUtil.click(Page_AddBlock.LUNTAN_BTN);
    }
    /*点击添加分区*/
    public static void clickbankuai(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AddBlock.ADD_BANKUAI,10);
        seleniumUtil.click(Page_AddBlock.ADD_BANKUAI);
    }
    /*输入名称*/
    public static void sendmingzi(SeleniumUtil seleniumUtil,String mingzi){
        seleniumUtil.waitForElementLoad(Page_AddBlock.ADD_TEXT,10);
        seleniumUtil.sendkeys(Page_AddBlock.ADD_TEXT,mingzi);
    }
    /*添加按钮*/
    public static void clicksubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_AddBlock.SUBMITADD_BTN,10);
        seleniumUtil.click(Page_AddBlock.SUBMITADD_BTN);
    }
    /*封装添加*/
    public static void addblock(SeleniumUtil seleniumUtil,String mima,String ming) throws InterruptedException {
        clickguanli(seleniumUtil);
        seleniumUtil.getwindown();
        /*sendmima(seleniumUtil,mima);
        clickmima(seleniumUtil);*/
        clickluntan(seleniumUtil);
        seleniumUtil.getiframe("main");
        clickbankuai(seleniumUtil);
        sendmingzi(seleniumUtil,ming);
        clicksubmit(seleniumUtil);
    }
}
