package testCase;

import org.testng.annotations.Test;
import pageHelper.AddBlock_PageHelper;
import pageHelper.Login_PageHelper;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class AddBlock extends BasicTestcase{
    @Test
    public void add() throws InterruptedException {
        Login_PageHelper.login(seleniumUtil,"admin","admin");
        Thread .sleep(3000);
        AddBlock_PageHelper.addblock(seleniumUtil,"admin","专有分区");
    }
}
