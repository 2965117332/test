package testCase;

import org.testng.annotations.Test;
import pageHelper.AllBlock_PageHelper;
import pageHelper.Login_PageHelper;
import pageHelper.Send_PageHelper;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/7.
 */
public class SendArticle extends BasicTestcase{
    @Test
    public void send() throws InterruptedException {
        Login_PageHelper.login (seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread .sleep(3000);
        AllBlock_PageHelper.cilckbMoren(seleniumUtil);
        Send_PageHelper.sendarticle(seleniumUtil,"你好，中国","中华人民共和国位于亚洲东部，太平洋西岸，是工人阶级领导的、以工农联盟为基础的人民民主专政的社会主义国家。");

    }
}
