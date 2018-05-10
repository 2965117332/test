package pageHelper;

import page.Page_Search;
import testCase.Search;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class Search_PageHelper {
    /*输入内容*/
    public static void searchtext(SeleniumUtil seleniumUtil,String neirong){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_TEXT,10);
        seleniumUtil.sendkeys(Page_Search.SEARCH_TEXT,neirong);
    }
    /*点击搜索*/
    public static void clicksearch(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_BUTTON,10);
        seleniumUtil.click(Page_Search.SEARCH_BUTTON);
    }
    /*点击第一篇*/
    public static void clickfirst(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_FIRST_TIEZI,10);
        seleniumUtil.click(Page_Search.SEARCH_FIRST_TIEZI);
    }

}
