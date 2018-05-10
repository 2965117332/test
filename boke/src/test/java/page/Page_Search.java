package page;

import org.openqa.selenium.By;

/**
 * Created by DuanJiangtao on 2018/5/8.
 */
public class Page_Search {
    /*输入搜索内容*/
    public static final By SEARCH_TEXT=By.id("scbar_txt");
    /*搜索内容切换*/
    public static final By SEARCH_XIALA=By.id("scbar_type");
    /*搜索按钮*/
    public static final By SEARCH_BUTTON=By.id("scbar_btn");
    /*搜索到第一个*/
    public static final By SEARCH_FIRST_TIEZI=By.linkText("hello，你好");

}
