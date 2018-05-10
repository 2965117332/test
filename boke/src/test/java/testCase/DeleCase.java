package testCase;

import org.testng.annotations.Test;
import pageHelper.AdminDele_PageHelper;
import pageHelper.Huifu_PageHelper;
import pageHelper.Login_PageHelper;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class DeleCase extends BasicTestcase{
    @Test
    public void deleTiezi() throws InterruptedException {
        Login_PageHelper.login(seleniumUtil,"admin","admin");
        Thread .sleep(3000);
       AdminDele_PageHelper.deletitle(seleniumUtil);
    }
}
