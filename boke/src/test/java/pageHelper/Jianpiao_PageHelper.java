package pageHelper;

import page.Page_Jianpiao;
import util.SeleniumUtil;

/**
 * Created by DuanJiangtao on 2018/5/9.
 */
public class Jianpiao_PageHelper {
    /*点击正在进行的投票*/
    public void clicktoupiao(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_Jianpiao.PIAO_NEIRONG,10);
        seleniumUtil.click(Page_Jianpiao.PIAO_NEIRONG);
    }
    /*得到投票标题*/
    public void gettitle(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(Page_Jianpiao.PIAO_ZHUTI,10);
        seleniumUtil.gettext(Page_Jianpiao.PIAO_ZHUTI);
    }
    /*得到比例*/
    public void getbili1(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Jianpiao.PIAO_BILI1,10);
        seleniumUtil.gettext(Page_Jianpiao.PIAO_BILI1);
    }
    /*得到选项*/
    public void getxuanxiang1(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Jianpiao.PIAO_MINGCHENG1,10);
        seleniumUtil.gettext(Page_Jianpiao.PIAO_MINGCHENG1);
    }
    /*得到比例*/
    public void getbili2(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Jianpiao.PIAO_BILI2,10);
        seleniumUtil.gettext(Page_Jianpiao.PIAO_BILI2);
    }
    /*得到选项*/
    public void getxuanxiang2(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(Page_Jianpiao.PIAO_MINGCHENG2,10);
        seleniumUtil.gettext(Page_Jianpiao.PIAO_MINGCHENG2);
    }
}
