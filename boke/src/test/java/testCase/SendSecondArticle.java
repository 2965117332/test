package testCase;
import org.testng.annotations.Test;
import pageHelper.AllBlock_PageHelper;
import pageHelper.Send_PageHelper;
import util.SeleniumUtil;
import pageHelper.Login_PageHelper;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class SendSecondArticle extends BasicTestcase{
    @Test
    public void loginsend() throws InterruptedException {
        Login_PageHelper.login (seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread .sleep(3000);
        AllBlock_PageHelper.cilckSecnd(seleniumUtil);
        Send_PageHelper.sendarticle(seleniumUtil,"hello，你好","“修身”，是指通过修养使个人具备美德。儒家经典《大学·圣经》中说：“身修而后家齐，家齐而后国治。”修身的目的是为了齐家、治国，修身的标准是个人达到较高的美德素养。个人美德主要包括：志向高远，诚实守信，刚正不阿，自强不息，重德贵义，律己修身等。");
    }
}
