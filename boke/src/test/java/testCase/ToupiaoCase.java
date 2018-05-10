package testCase;

import org.testng.annotations.Test;
import pageHelper.AllBlock_PageHelper;
import pageHelper.Login_PageHelper;
import pageHelper.TouPiao_PageHelper;

/**
 * Created by DuanJiangtao on 2018/5/9.
 */
public class ToupiaoCase extends BasicTestcase{
    @Test
    public void touupiao() throws InterruptedException {
        Login_PageHelper.login(seleniumUtil,"duanjiangtao","duanjiangtao");
        Thread .sleep(3000);
        AllBlock_PageHelper.cilckbMoren(seleniumUtil);
        TouPiao_PageHelper.fatiebtn(seleniumUtil);
        TouPiao_PageHelper.toupiaobtn(seleniumUtil);
        TouPiao_PageHelper.zhuti(seleniumUtil,"星期天看电影还是玩游戏");
        TouPiao_PageHelper.first(seleniumUtil,"看电影");
        TouPiao_PageHelper.second(seleniumUtil,"玩游戏");
        TouPiao_PageHelper.button(seleniumUtil);

    }

}
