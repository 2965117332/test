package testCase;

import org.testng.annotations.Test;
import pageHelper.Login_PageHelper;
import pageHelper.Search_PageHelper;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class Search extends BasicTestcase{
    @Test
    public void searchtiezi() throws InterruptedException {
        Login_PageHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread .sleep(3000);
        Search_PageHelper.searchtext(seleniumUtil,"你好");
        Search_PageHelper.clicksearch(seleniumUtil);
        seleniumUtil.getwindown();
        Search_PageHelper.clickfirst(seleniumUtil);
        seleniumUtil.getwindown();
        seleniumUtil.gettitle("hello，你好");
    }
}
