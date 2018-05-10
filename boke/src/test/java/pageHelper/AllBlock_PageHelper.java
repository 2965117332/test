package pageHelper;

import page.Page_AllBlock;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class AllBlock_PageHelper {
    /*点击默认板块按钮*/
    public static void cilckbMoren(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_AllBlock.MOREN_LINK,10);
        seleniumUtil.click(Page_AllBlock.MOREN_LINK);
    }
    /*点击第二板块按钮*/
    public static void cilckSecnd(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_AllBlock.SECOND_LINK,10);
        seleniumUtil.click(Page_AllBlock.SECOND_LINK);
    }
}
