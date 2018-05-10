package testCase;

import pageHelper.AllBlock_PageHelper;
import pageHelper.Huifu_PageHelper;
import pageHelper.Login_PageHelper;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class HuifuSendonCase extends BasicTestcase{
    public void huifu() throws InterruptedException {
        Login_PageHelper.login (seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread .sleep(3000);
        AllBlock_PageHelper.cilckSecnd(seleniumUtil);
        Huifu_PageHelper.browser(seleniumUtil,"很棒棒");

    }
}
