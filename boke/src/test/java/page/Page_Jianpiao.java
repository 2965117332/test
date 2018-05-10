package page;

import org.openqa.selenium.By;

/**
 * Created by DuanJiangtao on 2018/5/9.
 */
public class Page_Jianpiao {
    /*进入投票*/
    public static final By PIAO_NEIRONG=By.xpath("lic static final By PIAO_ZHUTI=By.id(\"thread_subject\");");
    /*投票主题*/
    public static final By PIAO_ZHUTI=By.id("thread_subject");
    /*投票1选项名称*/
    public static final By PIAO_MINGCHENG1=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[1]/td[1]/label");
    /*投票2选项名称*/
    public static final By PIAO_MINGCHENG2=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[3]/td[1]/label");
    /*投票1的比例*/
    public static final By PIAO_BILI1=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[2]/td[2]");
    /*投票2的比例*/
    public static final By PIAO_BILI2=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[4]/td[2]");
}
