package page;

import org.openqa.selenium.By;

/**
 * Created by DuanJiangtao on 2018/5/9.
 */
public class Page_Toupiao {
    /*发帖按钮*/
    public static final By FATIE_BTN=By.xpath("//*[@id=\"newspecial\"]/img");
    /*投票按钮*/
    public static final By TOUPIAO_BTN=By.xpath("//*[@id=\"ct\"]/div/ul/li[2]/a");
    /*投票的主题文本框*/
    public static final By TOUPIAO_TEXT=By.id("subject");
    /*投票得到一方*/
    public static final By TOUPIAO_TEXT1=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");
    /*投票的另一方*/
    public static final By TOUPIAO_TEXT2=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");
    /*发起投票按钮*/
    public static final By TOUPIAO_BUTTON=By.id("postsubmit");

}
