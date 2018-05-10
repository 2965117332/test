package testCase;

import org.testng.annotations.Test;
import pageHelper.Huifu_PageHelper;
import pageHelper.Login_PageHelper;


/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class HuifuCase extends BasicTestcase{

    @Test
    public  void browser() throws InterruptedException {
        Login_PageHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread .sleep(3000);
        Huifu_PageHelper.browser(seleniumUtil,"支持帖子");
        seleniumUtil.backhome();
    }
}
